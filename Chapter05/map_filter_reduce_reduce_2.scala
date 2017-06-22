var a = List[Int](100, 2, 30, 60, 555)
var b = a.reduce((x: Int, y: Int) => x max y)

println(b)