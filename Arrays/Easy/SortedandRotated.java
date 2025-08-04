public class SortedandRotated {
    public boolean check(int[] nums) {
        int n = nums.length;
        int dropCount = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                dropCount++;
                if (dropCount > 1)
                    return false;
            }
        }
        return true;
    }
}
