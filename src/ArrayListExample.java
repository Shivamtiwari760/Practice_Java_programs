import java.util.ArrayList;
import java.util.List;

import static java.nio.file.Files.size;

public class ArrayListExample {

    public static void main(String args[]){

        List<String> names = new ArrayList<String>();
        List<String> names2 = new ArrayList<String>();

        String[] s = {"volvo","maruti","lamborgini"};

        names.add("Shivam");
        names.add("Tiwari");

        System.out.println(names);

        names2.addAll(List.of(s));

        System.out.println(names2);

        names.remove(1);
        System.out.println(names);

        System.out.println(names.size());



    }
}
