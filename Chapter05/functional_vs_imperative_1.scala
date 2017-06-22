class AddDemoOOP {
    var x = 0
    def add(y: Int): Int = {
         x += y
         x
    }
}

val a = new AddDemoOOP()
print(a.add(1))
print(a.add(1))