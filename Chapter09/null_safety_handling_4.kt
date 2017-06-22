fun test() {
    var currentTime: java.util.Date? = null
    println("Next line compiles, but throws exception when running")
    var seconds = currentTime!!.getTime()
    println(seconds)
}
 
test()