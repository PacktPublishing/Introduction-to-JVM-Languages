class ExceptionDemo {
    public static void main(String[] args) {
		try {
			System.out.println(0/0);
			System.out.println("exit");
		} catch (NullPointerException e) {
			System.out.println("NULL POINTER EXCEPTION!");
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("DIFFERENT ERROR");
		}
	}
}