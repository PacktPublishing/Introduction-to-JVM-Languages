val immutableMap = Map[Int, String](10 -> "ten", 20 -> "twenty")
println(immutableMap(20))

val newImmutableMap = immutableMap + (30 -> "thirty")
println(newImmutableMap)

val combinedMap = newImmutableMap ++ Map[Int, String](24 -> "twentyfour")
println(combinedMap)