var a = List[Int](100, 150, 200, 300)
var b = a.filter((x: Int) => x > 150)

println(b)