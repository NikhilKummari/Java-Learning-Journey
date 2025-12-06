import java.util.HashMap;
import java.util.Map;


public class ExampleMap {
    public static void main(String[] args) {
        Map<String,Integer> students = new HashMap<>();
        students.put("A", 30);
        students.put("B", 40);
        students.put("C", 60);
        students.put("D", 30);
        // System.out.println(students.values());

        // for(String key : students.keySet()){
        //     System.out.println(key + " : " + students.get(key));
        // }

        for(int val : students.values()){
            System.out.println(val);
        }
        

    }
}
