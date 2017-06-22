import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String... args) {
		ArrayList list1 = new ArrayList();
		list1.add("this is a test");
		list1.add(0, "Hello");

		ArrayList list2 = new ArrayList();
		list2.addAll(list1);

		list1.clear();
		System.out.println(list1);		
		System.out.println(list2);		
		System.out.println(list2.contains("this is a test"));		
	}
}
