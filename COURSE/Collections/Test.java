import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Nikhil");
        names.add("Alice");
        names.add("Bob");

        Collections.sort(names, (a , b) -> Integer.compare(a.length() , b.length()));


        for(String str : names){
            System.out.println(str + " : " + str.length());
        }
    }
}
