class Person {
    private String personName;
    public void setName(String name) { this.personName = name }
    public String getName() { return this.personName }
}

p = new Person()
p.name = "D. Vader"
println(p.name)