class LambdaDemo {
    public static void main(String[] args) {
        Thread thread1 = new Thread( () -> {
	        try {
	        	System.out.println("Thread started");
	            Thread.sleep(3000);
	            System.out.println("Thread ends");
	        } catch (InterruptedException e) {
	        }
        });
        thread1.start();
    }
}