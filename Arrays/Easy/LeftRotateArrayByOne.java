public class LeftRotateArrayByOne {
    public static void leftRotate(int[] nums) {
        int one = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = one;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        leftRotate(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
