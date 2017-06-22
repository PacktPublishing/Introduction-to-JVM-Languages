interface Interface1 { 
    void method1(); 
}

interface Interface2 {
    public void method2();
} 

class InterfaceDemo implements Interface1, Interface2 {
    @Override
    public void method1() { 
    	// Implementation code...
    	System.out.println("Method1 code...");
    }  

    @Override
    public void method2() {
    	// Implementation code...
    	System.out.println("Method2 code...");
    }
}

public class InterfaceDemoMain {
	public static void main(String[] args) {
		InterfaceDemo demo = new InterfaceDemo();
		demo.method1();
		demo.method2();
	}
}