class Point (val x: Int, val y: Int) {
    override fun toString(): String { return "${x}, ${y}" }
}

val p = Point(-30, 50)
println(p)