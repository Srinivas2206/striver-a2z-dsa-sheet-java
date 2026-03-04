package BinarySearch.BSonAnswer;

public class FindSqrt {
    public int floorSqrt(int n) {
        int low = 0;
        int high = n;
        int ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if ((long) mid * mid <= n) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
}
