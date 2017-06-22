// This code does not produce output when loaded inside Kotlin's REPL.
// It must be compiled as described in the chapter.

fun function1() {
    println("function1 is running...")
}

var property1: String = "default value of property1"

fun main(args : Array<String>) {
    // Executable code here...
    function1()
    println(property1)
}