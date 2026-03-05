package BinarySearch.BSonAnswer;

import java.util.Arrays;

public class AggressiveCows {
    public int aggressiveCows(int[] nums, int k) {
        Arrays.sort(nums);
        int low = 1;
        int high = nums[nums.length - 1] - nums[0];
        int ans = 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canKCows(nums, mid, k)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public boolean canKCows(int[] nums, int d, int k) {
        int left = 0;
        int right = 1;
        int n = nums.length;
        int count = 1;
        while (left < n && right < n) {
            if ((nums[right] - nums[left]) >= d) {
                count++;
                left = right;
                right = right + 1;
            } else {
                right++;
            }
        }
        return count >= k;
    }
}
