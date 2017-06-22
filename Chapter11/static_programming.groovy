import groovy.transform.TypeChecked

@TypeChecked
class Demo {
    @TypeChecked(groovy.transform.TypeCheckingMode.SKIP)
    static void main(String[] args) {
       def d = new Demo()
       // WILL FAIL TO COMPILE
       d.thisMethodDoesNotExist()
    }

    def methodMissing(String name, args) {
        println("Method '$name' was called")
    }
}