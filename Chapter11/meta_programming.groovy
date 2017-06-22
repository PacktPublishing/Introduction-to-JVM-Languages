class MetaProgrammingDemo {
    def propertyMissing(String name) {
        println("Non-existent property '$name' was read")
        return -1
    }
    
    def propertyMissing(String name, args) {
        println("Non-existent property '$name' was written to: '$args'")
    }

    def methodMissing(String name, args) {
        println("Non-existent method '$name' was called with '$args' parameters")
    }

}

def demo = new MetaProgrammingDemo()
// Next line throws an exception!
demo.nonExistingProperty = "some value"
println(demo.nonExistingProperty)
demo.methodThatDoesNotExist(1000, "demo")