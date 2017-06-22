import scala.collection.mutable

val aMutableList = mutable.ListBuffer[Int](1, 2, 5)
aMutableList.remove(2)
aMutableList.append(3)

println(aMutableList(0))