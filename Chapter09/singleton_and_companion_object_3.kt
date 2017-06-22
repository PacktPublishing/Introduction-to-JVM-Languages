class StaticDemo {
    companion object {
        @JvmStatic fun realStaticMethod() {
            println("Real static method...")
        }
    }
}

StaticDemo.realStaticMethod()