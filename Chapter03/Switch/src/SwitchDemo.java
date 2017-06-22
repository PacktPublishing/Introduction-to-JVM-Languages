class SwitchDemo {
    public static void main(String[] args) {
		int value = 3;
		String s = "";
		switch (value) {
		    case 1: 
		    	s = "One";
			break;
		    case 2:
		    case 3:
		    	s = "Two or three";
		    	break;
		    default:
		    	s = "Something else";
		}
		System.out.println(s);
    }
}