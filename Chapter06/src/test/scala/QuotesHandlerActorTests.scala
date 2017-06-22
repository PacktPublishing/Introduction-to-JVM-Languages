import akka.actor.{ActorSystem, Props}
import akka.testkit.{TestKit, ImplicitSender, TestActorRef}
import org.scalatest.{Matchers, FlatSpecLike, BeforeAndAfterAll}
import akkaquote.actor.QuotesHandlerActor
import akkaquote.message.{AddQuote, Quote, QuoteAdded}

class QuotesHandlerActorTests() 
  extends TestKit(ActorSystem("Tests"))
  with ImplicitSender with Matchers
  with FlatSpecLike with BeforeAndAfterAll {

  override def afterAll(): Unit = {
    system.terminate()
  }  
  
  "An QuotesHandlerActor" should "add new quotes" in {
    val quoteHandlerActorRef = TestActorRef(Props[QuotesHandlerActor])
    val actorInstance = quoteHandlerActorRef.underlyingActor.asInstanceOf[QuotesHandlerActor]
  
    actorInstance.quotes.size should be(0)
   
    val quote = new Quote("This is a test", "me")
    quoteHandlerActorRef ! AddQuote(quote)
    expectMsg(QuoteAdded)
  
    actorInstance.quotes.size should be(1)
    actorInstance.quotes(0).quote should be("This is a test")
    actorInstance.quotes(0).author should be("me")
  }  
}