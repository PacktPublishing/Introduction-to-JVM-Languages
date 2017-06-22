import java.util.ArrayList;

class FinalDemo2 {
    private static final ArrayList<String> finalList = new ArrayList<>();

    public static final void main(String[] args) {
        finalList.add("Both strings can be added, because");
        finalList.add("the ArrayList itself is mutable.");
        
        System.out.println(finalList);
    }
}