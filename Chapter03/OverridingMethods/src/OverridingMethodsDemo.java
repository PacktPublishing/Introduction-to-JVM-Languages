class TheParentClass {
    int anInt=2;
    void aMethod() {
    	System.out.println("TheParentClass.aMethod()");
    }
}

class TheSubClass extends TheParentClass {
    @Override
    public void aMethod() {
        super.aMethod();
        // More code....
    	System.out.println("TheSubClass.aMethod()");
    }    
}

public class OverridingMethodsDemo {
	public static void main(String[] args) {
    	TheSubClass demo = new TheSubClass();
    	demo.aMethod();
    }		
}