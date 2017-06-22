class POJO {
    private int value = 0;
    
    public POJO() {
    }
    
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
    public static void main(String[] args) {
		POJO pojo = new POJO();
		pojo.setValue(42);
		System.out.println(pojo.getValue());
    }
}