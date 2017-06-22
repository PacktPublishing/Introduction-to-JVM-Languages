import java.util.ArrayList;

class ClassCastExceptionExample {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add(new Integer(123));
        list.add("This is not an integer");

        Integer i = (Integer)list.get(0);
        i = (Integer)list.get(1); // THIS LINE CAUSES EXCEPTION AT RUN-TIME!!!!
        
        System.out.println(list);
    }
}