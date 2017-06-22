class ForLoopDemo {
    public static void main(String[] args) {
	for (int i=0; i < 4; i++) {
	    if (i == 1)
		continue;
	    if (i == 3)
		break;
	    System.out.println(i);
	}    }
}