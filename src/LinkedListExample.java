import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args){

        LinkedList<String> lList = new LinkedList<>();

        lList.add("Java");
        lList.add("Springboot");
        lList.add("mysql");
        lList.add("Microservies");

        System.out.println(lList);

        lList.remove(3);
        System.out.println(lList);

        System.out.println(lList.size());
        lList.clear();
        System.out.println(lList);

    }
}
