import scala.collection.mutable

val mutableMap = mutable.HashMap[Int, String](10->"ten", 50->"fifty")

mutableMap += (100 -> "Hundred", 150 -> "Hundred and fifty")
mutableMap -= 10

println(mutableMap)