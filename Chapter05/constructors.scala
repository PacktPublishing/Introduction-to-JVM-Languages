class ClassWithParameterizedConstructor(var parm1: Int, parm2: Int) {
    println("This code is executed as part of the constructor")
}

val c = new ClassWithParameterizedConstructor(10, 20)