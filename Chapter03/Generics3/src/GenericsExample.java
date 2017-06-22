import java.util.HashMap;
import java.util.Map;

class GenericsExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("one", new Integer(1));
        map.put("ten", new Integer(10));
        System.out.println(map.get("one"));
    }
}