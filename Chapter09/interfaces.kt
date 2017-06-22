interface NameOfInterface {
    fun functionWithoutImplementation()
    fun functionWithImplementation(i: Int) {
        // Default implementation here...
    }
}

interface InterfaceWithProperties {
    var propertyWithGetterAndSetter: Int
    val propertyWithGetterOnly: String
    val propertyWithDefaultImplementation: Double
        get() = 0.0
}

class DemoClass : NameOfInterface, InterfaceWithProperties {
    override fun functionWithoutImplementation() { println("but now it has a implementation") }
    override var propertyWithGetterAndSetter: Int = 0
    override val propertyWithGetterOnly: String = "test"
}

val d = DemoClass()
d.functionWithoutImplementation()
println(d.propertyWithGetterAndSetter)
println(d.propertyWithGetterOnly)