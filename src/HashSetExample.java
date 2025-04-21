import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args){
        HashSet<String> hset = new HashSet<>();
        hset.add("Java");
        hset.add("microservice");
        hset.add("mysql");
        hset.add("spring");
        System.out.println(hset);


        hset.add("Java");
        System.out.println(hset);
        System.out.println(hset.size());

        hset.clear();
        System.out.println(hset);


    }
}
