class NormalClass {
    companion object CompanionObject {
        var i = 100
        fun yetAnotherCoolMethod() {
            i = 50
        }
    }
}

NormalClass.CompanionObject.yetAnotherCoolMethod()

println(NormalClass.i)
println(NormalClass.CompanionObject.i)