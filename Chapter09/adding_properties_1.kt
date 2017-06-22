class PropertyDemo1 {
    var mutableProperty: Int = 0
}

val p1 = PropertyDemo1()
println(p1.mutableProperty)

p1.mutableProperty = 24
println(p1.mutableProperty)