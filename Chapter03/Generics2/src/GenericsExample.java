import java.util.ArrayList;
import java.util.List;

class GenericsExample {
    public static void main(String[] args) {
        List<Integer> listWithIntegers = new ArrayList<>();
        listWithIntegers.add(new Integer(1));
        System.out.println(listWithIntegers);
    }
}