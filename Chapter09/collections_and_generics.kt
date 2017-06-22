val someImmutableInts: List<Int> = listOf(10, 20, 30)
println("$someImmutableInts --> ${someImmutableInts.size} elements")

val mutableDoubles: MutableList<Double> = mutableListOf(3.14, 1.0, 25.5)
mutableDoubles.add(1, -1.99)
mutableDoubles.removeAt(0)
println(mutableDoubles)

val mapNumbers: Map<String, Int> = mapOf("one" to 1, "ten" to 10, "thirty" to 30)
println(mapNumbers["thirty"])
for ((key, value) in mapNumbers) {
    print("$key = $value   ")
}
println()