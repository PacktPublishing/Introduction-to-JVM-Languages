package javafxdemo

import javafx.application.Application
import javafx.stage.Stage
import javafx.scene.Scene
import javafx.scene.layout.Pane
import javafxdemo.extensions.prettyPrint

class KotlinJavaFXDemo : Application() {
	override fun start(primaryStage: Stage) {
	    primaryStage.title = "Kotlin JavaFX Demo"
	
	    val pane = Pane()
	    val scene = Scene(pane, 500.0, 500.0)
		pane.prettyPrint(40.0, primaryStage.title)
	    primaryStage.scene = scene
	
	    primaryStage.show()		
	}
}

fun main(args: Array<String>) {
	Application.launch(KotlinJavaFXDemo::class.java)
}
