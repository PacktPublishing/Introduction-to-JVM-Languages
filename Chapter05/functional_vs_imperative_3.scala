import scala.collection.mutable

val aMutableArray = mutable.ArrayBuffer[Int](1, 2, 3)
aMutableArray += 4
println(aMutableArray(3))