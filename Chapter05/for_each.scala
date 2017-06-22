var a = List[Int](5, 10, 15, 20, 25)
a.foreach((x: Int) => println("%03d".format(x)))