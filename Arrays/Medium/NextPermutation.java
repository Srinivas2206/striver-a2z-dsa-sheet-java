public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int p1 = -1, p2 = -1;
        for (int i = n - 1; i >= 1; i--) {
            if (nums[i - 1] < nums[i]) {
                p1 = i - 1;
                break;
            }
        }
        if (p1 == -1) {
            reverse(nums, 0, n - 1);
        } else {
            for (int i = n - 1; i > p1; i--) {
                if (nums[i] > nums[p1]) {
                    p2 = i;
                    break;
                }
            }
            swap(nums, p1, p2);
            reverse(nums, p1 + 1, n - 1);
        }
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}