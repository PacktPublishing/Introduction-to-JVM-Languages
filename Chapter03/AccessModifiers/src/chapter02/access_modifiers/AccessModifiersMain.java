package chapter02.access_modifiers;

import chapter02.access_modifiers.demonstration.DemoVariables;

public class AccessModifiersMain {
    public static void main(String[] args) {
        DemoVariables demo = new DemoVariables();
        System.out.println(demo.publicVariable);
    }
}