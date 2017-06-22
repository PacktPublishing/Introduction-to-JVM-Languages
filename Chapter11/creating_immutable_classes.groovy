import groovy.transform.Immutable

class Person {
    public final String name
    public Person(String name) { this.name = name }
}

@Immutable(knownImmutableClasses=[Person])
class Demo {
    Person person = new Person("test")
}

def d = new Demo()