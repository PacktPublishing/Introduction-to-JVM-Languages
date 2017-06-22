def list = [10, 20, 30, 40, 50]
println list[1]
println list[-4]
println list[1..2]
println list[0,3]
println list[0..2, 4, 3]

def emptyList = []
if (!emptyList) {
    println("List is not empty")
}

list.each({
    def bar = "X" * it
    println "${bar} ${it}"
})

println list.any { it > 20 }
println list.every { it < 50 }
println list.find { it == 30}
println list.findAll { it > 30 }
println list.join("/")
println list.min()
println list.max()
println list.sum()
