val immutableList = List[Int](1, 2, 3, 4, 5)
val newImmutableList1 = 0 :: immutableList
val newImmutableList2 = immutableList ::: List(6, 7)

println(immutableList)
println(newImmutableList1)
println(newImmutableList2)