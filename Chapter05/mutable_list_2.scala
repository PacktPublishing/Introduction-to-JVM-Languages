import scala.collection.mutable

val aMutableList = mutable.ListBuffer[Int](1, 2, 5)
aMutableList -= 5
aMutableList += 3

println(aMutableList)