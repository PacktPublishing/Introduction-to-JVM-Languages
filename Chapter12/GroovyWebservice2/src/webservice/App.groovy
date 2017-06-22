package webservice

import java.sql.DriverManager
import groovy.sql.Sql
import io.vertx.core.AbstractVerticle
import io.vertx.core.Future
import io.vertx.core.Vertx
import io.vertx.core.http.HttpMethod

class Main extends AbstractVerticle {
	
	def createDatabaseConnection() {
		def connection = DriverManager.getConnection("jdbc:h2:mem:test;DB_CLOSE_DELAY=-1")
		return connection
	}

	def createDatabaseStructure(connection) {
	    def statement = connection.createStatement()
	
	    def sqlUsers = """
	        CREATE TABLE user (
	            id INT AUTO_INCREMENT NOT NULL,
	            name VARCHAR(255),
	            PRIMARY KEY (id)
	        )
	    """
	    statement.executeUpdate(sqlUsers)
		
		def sqlBlog = """
			CREATE TABLE blog (
		        id INT AUTO_INCREMENT NOT NULL,
		        title VARCHAR(255) NOT NULL,
		        user INT NOT NULL,
				post CLOB,
		        PRIMARY KEY (id),
		        FOREIGN KEY(user) REFERENCES user(id))
		"""
		statement.executeUpdate(sqlBlog)
		statement.close()
	}	

	def addDemoRecords(connection) {
		def sql = new Sql(connection)
		def createdUsers = sql.executeInsert("INSERT INTO user (name) VALUES (?)", ["Admin"])
		def userId = createdUsers[0][0]
		sql.execute(""" INSERT INTO blog (title, user, post) VALUES (?, ?, ?)""", ['Test post', userId,  "This is a test post"])
		sql.close()
	}

	def generateXML() {	
		def xmlContent = new StringWriter()
		def xmlWriter = new groovy.xml.MarkupBuilder(xmlContent)

		def connection = createDatabaseConnection()
		def sql = new Sql(connection)
				
		def sqlQuery = """
			SELECT B.id, B.title, B.post, U.name AS user_name
            FROM blog B
			INNER JOIN user U ON B.user = U.id"""
		sql.eachRow(sqlQuery) { record ->
			xmlWriter.posts {
				post(id: record.id) {
					title(record.title)
					user(record.user_name)

					def p = record.post
					post(p.getSubString(1, p.length().intValue()))
				}
			}
		}
		sql.close()
		return xmlContent.toString()
	}

	public void start(Future<Void> fut) {		
		vertx
			.createHttpServer()
			.requestHandler() { request ->
				if (request.path() == "/blogs/" && request.method() == HttpMethod.GET) {
					request
						.response()
						.putHeader("content-type", "application/xml")
						.end( generateXML() )
				} else {
					request
						.response()
						.setStatusCode(404)
						.end("404");
				}
							}
			.listen(8080) { result -> 
				if (result.succeeded()) 
					fut.complete()
				else
					fut.fail(result.cause())
			}

	}
	
	static public void main(String[] args) {
		def app = new Main()
		def connection = app.createDatabaseConnection()
		app.createDatabaseStructure(connection)
		app.addDemoRecords(connection)
		connection.close()

		Vertx vertx = Vertx.vertx();
		vertx.deployVerticle(new Main());
	}
}