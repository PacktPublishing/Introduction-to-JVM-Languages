import java.util.HashMap;

public class HashMapExample {
	public static void main (String[] args) {
		HashMap map = new HashMap();

		map.put("key1", "value1");
		map.put("key1", "value2");
		map.putIfAbsent("key1", "value3");

		System.out.println(map.get("key1"));
		System.out.println(map.containsKey("value2"));
		System.out.println(map.size());		
	}
}
