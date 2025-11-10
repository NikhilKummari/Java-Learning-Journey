public class MaxElement {
    public static void main(String[] args) {
        int[] nums = {5, 2, 9, 3, 7};
        int max = nums[0];
        for (int n : nums) {
            if (n > max) {
                max = n;
            }
        }
        System.out.println("Max = " + max);
    }
}
