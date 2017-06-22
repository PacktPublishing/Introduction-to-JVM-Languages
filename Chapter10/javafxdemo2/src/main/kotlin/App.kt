package javafxdemo

import javafx.application.Application
import javafx.stage.Stage
import javafx.scene.Scene
import javafx.scene.layout.Pane
import javafxdemo.extensions.prettyPrint
import javafx.scene.control.TextField
import javafx.scene.layout.BorderPane
import javafx.scene.layout.HBox
import javafx.scene.control.Label
import javafx.scene.layout.Priority
import javafx.scene.text.Text
import javafx.scene.text.Font
import javafx.scene.text.FontWeight
import javafx.animation.AnimationTimer


class KotlinJavaFXDemo : Application() {
	
	override fun start(primaryStage: Stage) {
	    primaryStage.title = "Kotlin JavaFX Demo"
	
	    val textField = TextField()
	    val mainPane = BorderPane()
	    mainPane.top = createHeaderPane(primaryStage.title)
		mainPane.center = AnimatedText().getPane(textField)
		mainPane.bottom = createInputPane(textField)
	
	    val scene = Scene(mainPane, 500.0, 500.0) 
	    primaryStage.scene = scene
	 
	    primaryStage.show()
	}

	fun createHeaderPane(title: String): Pane {
		val pane = Pane()
		pane.prettyPrint(30.0, title)
		return pane
	}

	fun createInputPane(textField: TextField): Pane {
	    val label = Label("Input text:") 
	    label.minWidth = 65.0 
	
	    val inputPane = HBox()
	    inputPane.children.add(label)
	    inputPane.children.add(textField)
	
	    HBox.setHgrow(textField, Priority.ALWAYS)
	
	    return inputPane
	}
}	

	
class AnimatedText {
    val animatedText = Text()
    val animationPane = Pane()

    var directionX = 3.0
    var directionY = 3.0

    val timer = object : AnimationTimer() {
		override fun handle(now: Long) {
			if (animatedText.x < 0.0 || animatedText.x > animationPane.width - animatedText.layoutBounds.width)
				directionX = -directionX
	 
			if (animatedText.y < 0.0 || animatedText.y > animationPane.height)
				directionY = -directionY

			animatedText.x += directionX
			animatedText.y += directionY
		}
	}

	fun getPane(textField: TextField): Pane {
		animatedText.x = 0.0
		animatedText.y = 0.0
		animatedText.font = Font.font("Verdana", FontWeight.BOLD, 15.0)
		animationPane.children.add(animatedText)
		timer.start()
		animatedText.textProperty().bind(textField.textProperty())
		return animationPane
	}	
}


fun main(args: Array<String>) {
	Application.launch(KotlinJavaFXDemo::class.java)
}