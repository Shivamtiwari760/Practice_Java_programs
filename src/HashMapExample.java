import java.security.KeyStore;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args){

        HashMap<String, String> hmap = new HashMap<>();
        hmap.put("1","java");
        hmap.put("2","spring");
        hmap.put("3","mysql");
        hmap.put("4","microservices");

        System.out.println(hmap);;
        System.out.println(hmap.size());


        System.out.println(hmap.containsKey("1"));
        System.out.println(hmap.containsValue("shivam"));

        System.out.println(hmap.keySet());

        Set<Map.Entry<String,String>> entrySet = hmap.entrySet();

        for (Map.Entry<String, String> ent : entrySet) {
            System.out.println("key : " + ent.getKey() + " value : " + ent.getValue());
        }



    }
}
