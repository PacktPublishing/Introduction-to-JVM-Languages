class Person {
    String name

    static void main(String[] args) {
        def p = new Person()
        p.name = "fooBar"
        println p.name
    }
}