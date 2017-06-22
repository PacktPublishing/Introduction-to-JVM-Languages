open class ParentClass {
    open fun greatMethod() {
       println("Great Method parent")
	}
}

class ChildClass: ParentClass() {
    override fun greatMethod() {
        super.greatMethod()
    }
}

var c = ChildClass()
c.greatMethod()