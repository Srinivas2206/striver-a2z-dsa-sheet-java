package BinarySearch.BSon1Darrays;

public class LowerBound {
    public int lowerBound(int[] nums, int x) {
        int n = nums.length;
        int l = 0;
        int r = n - 1;
        int idx = n;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] >= x) {
                idx = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return idx;
    }
}
