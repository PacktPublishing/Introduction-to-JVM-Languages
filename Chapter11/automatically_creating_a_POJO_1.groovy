import groovy.transform.Canonical

@Canonical
class CanonicalDemo {
    def property1
    def property2
    def property3
}

def demo = new CanonicalDemo("value for property1", "value for property2")
println("${demo.property1}, ${demo.property2}, ${demo.property3}")

demo = new CanonicalDemo(property1:"value 1", property3: "value3")
println("${demo.property1}, ${demo.property2}, ${demo.property3}")
