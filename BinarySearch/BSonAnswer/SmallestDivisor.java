package BinarySearch.BSonAnswer;

public class SmallestDivisor {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = 1;
        for (int num : nums)
            high = Math.max(high, num);

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canDivide(nums, mid, threshold)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public boolean canDivide(int[] nums, int div, int t) {
        int result = 0;
        for (int num : nums) {
            result += (num + div - 1) / div;
        }
        return result <= t;
    }
}
