package BinarySearch.BSon1Darrays;

import java.util.ArrayList;

public class FindRotations {
    public int findKRotation(ArrayList<Integer> nums) {
        int low = 0;
        int high = nums.size() - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (nums.get(mid) > nums.get(high)) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}
