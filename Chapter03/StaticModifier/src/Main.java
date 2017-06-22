public class Main {
    public static void main(String[] args) {
        StaticDemo demo1 = new StaticDemo();
        demo1.staticVariable = "Demo 1 static";
        demo1.instanceVariable = "Demo 1 instance";

        StaticDemo demo2 = new StaticDemo();
        demo2.staticVariable = "Demo 2 static";
        demo2.instanceVariable = "Demo 2 Instance";

        System.out.println(StaticDemo.staticVariable);
        System.out.println(demo1.instanceVariable);
        System.out.println(demo2.instanceVariable);
    }
}