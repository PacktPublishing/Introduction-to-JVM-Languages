class MethodDemo {
    fun instanceMethod(i: Int): Int {
        return i*i
    }
}

var demo = MethodDemo()
println(demo.instanceMethod(5))