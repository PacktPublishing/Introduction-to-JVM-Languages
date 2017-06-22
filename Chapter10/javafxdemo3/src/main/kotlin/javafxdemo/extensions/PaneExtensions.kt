package javafxdemo.extensions

import javafx.scene.layout.Pane
import javafx.scene.text.Text
import javafx.scene.text.Font
import javafx.scene.text.FontWeight
import javafx.scene.paint.Color
import javafx.scene.effect.InnerShadow

fun Pane.prettyPrint(y: Double, text: String) {
    val t = Text()
    t.text = text
    t.font = Font.font("Verdana", FontWeight.BOLD, 30.0)
    t.fill = Color.YELLOW
 
    t.x = 0.0
    t.y = y

	val shadow = InnerShadow()
	shadow.offsetX = 2.0
	shadow.offsetY = 2.0
	t.effect = shadow
	
    this.children.add(t)
}