class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.setName("fooBar");
        System.out.println(p.getName());
    }
}