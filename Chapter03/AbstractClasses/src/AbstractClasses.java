abstract class AbstractClassA {
   public abstract void method1();
}

abstract class AbstractClassB extends AbstractClassA  {
   public abstract void method2();
}

class ConcreteClass extends AbstractClassB {
    @Override
    public void method1() {
	// Implementation code
    }

    @Override
    public void method2() {
	// Implementation code }
    }
}

class Main {
	public static void main(String[] args) {
		ConcreteClass concreteCLass = new ConcreteClass();
		concreteCLass.method1();
		concreteCLass.method2();
	}
}