class PropertyDemo3 {
    var customProperty: Int = 1000
        get() { field + 1 }
        set(value) { field = value }
}

var p3 = PropertyDemo3()
p3.customProperty = 10
println(p3.customProperty)