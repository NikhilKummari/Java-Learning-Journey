public class Sum {
    public static void main(String[] args) {
        int[] nums = {2, 5, 7, 1};
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        System.out.println("Sum = " + sum);
    }
}
