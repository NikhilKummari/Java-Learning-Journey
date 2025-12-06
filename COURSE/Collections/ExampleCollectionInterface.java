import java.util.*;
public class ExampleCollectionInterface{
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
            nums.add(10);
            nums.add(60);
            nums.add(30);
            nums.add(50);
            nums.set(3,3);

            // System.out.println(nums.indexOf(3));

            // for(int n : nums){
            //     System.out.println(n);
            // }

        
         Set<Integer> nums2 = new TreeSet<>();
            nums2.add(10);
            nums2.add(60);
            nums2.add(30);
            nums2.add(50);
            nums2.add(50);


        Iterator<Integer> values = nums2.iterator(); // Iterator is the top most inteface in collection Hierarcy.
        while(values.hasNext())
            System.out.println(values.next());

            // System.out.println(nums2);

        }
    }

