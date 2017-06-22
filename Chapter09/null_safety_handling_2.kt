fun test() {
    var currentTime: java.util.Date? = java.util.Date()
	println("Line below will now compile fine")
    var seconds = if (currentTime != null) currentTime.getTime() else 0
    println(seconds)
}

test()