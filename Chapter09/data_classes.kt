data class Computer(val brand: String, val cpu: String, var memoryGB: Int, var harddiskSizeGB: Int)

var pc = Computer("Dell", "Intel Core i5", 8, 1024)
println(pc)
println(pc.brand)
pc.memoryGB = 4

var pc2 = pc.copy(brand="HP", memoryGB=16)
println(pc2)