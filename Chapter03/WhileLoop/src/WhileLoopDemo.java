class WhileLoopDemo {
    public static void main(String[] args) {
		int i = 10;
		// Variable i is evaluated and loop will be ignored.
		while (i < 10) {
  		    // The loop will not be entered!
			System.out.println(i);
			i++;
		}
		// Nothing is printed to the output
    }
}