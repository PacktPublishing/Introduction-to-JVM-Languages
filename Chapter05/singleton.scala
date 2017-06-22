object SingletonObjectName {
    var x = 100
    def printX() = println(x)
}

SingletonObjectName.x = 250
SingletonObjectName.printX()
