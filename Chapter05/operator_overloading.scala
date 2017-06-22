class CustomClass(var x: Int) {
    def + (other: CustomClass) = {
        new CustomClass(x + other.x)
    }
}

val result = new CustomClass(400) + new CustomClass(155)
println(result.x)