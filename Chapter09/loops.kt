// FOR
val items = listOf(10, 20, 30)
for (i in items) {
    println(i)
}

// WHILE
println()
var x = 10
while (x > 20) {
    println("Hello")
    x++
}

// DO.. WHILE 
var y = 0
do {
    y++
    if (y == 2)
        continue
    println(y)
} while (y % 5 != 0)