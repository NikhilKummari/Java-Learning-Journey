import java.util.*;
public class LearnHashMap {
    public static void main(String[] args) {
        Map<Integer, String> sdata = new HashMap<>();
        sdata.put(1 , "Alice");
        sdata.put(2,"bob");

        for(Map.Entry <Integer, String> entry : sdata.entrySet()){
            System.out.print(entry.getKey() + "------->");
            System.out.println(entry.getValue());
            // System.out.println("---------------");
        }
    }
}
