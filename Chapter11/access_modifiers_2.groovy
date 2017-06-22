public class MainDemoClass {
    public static void main(String[] args) {
        ClassWithSecret secret = new ClassWithSecret();
        // This should have raised an exception, since
        // privateVariable is private.
        System.out.println(secret.privateVariable);
    }
}

class ClassWithSecret {
    private int privateVariable = -1;
}