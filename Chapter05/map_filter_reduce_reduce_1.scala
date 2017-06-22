var a = List[Int](10, 20, 30, 40, 50)
var b = a.reduce((x: Int, y: Int) => x + y)
println(b)