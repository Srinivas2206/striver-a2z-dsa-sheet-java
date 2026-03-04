package BinarySearch.BSonAnswer;

public class MinDaystoMakeBouqet {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if (n < (long) m * k)
            return -1;
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for (int b : bloomDay) {
            low = Math.min(low, b);
            high = Math.max(high, b);
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canMake(bloomDay, mid, m, k)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public boolean canMake(int[] bloomDay, int days, int m, int k) {
        int bouqets = 0;
        int flowers = 0;
        for (int bloom : bloomDay) {
            if (bloom <= days) {
                flowers++;
                if (flowers == k) {
                    bouqets++;
                    flowers = 0;
                    if (bouqets >= m)
                        return true;
                }
            } else {
                flowers = 0;
            }
        }
        return false;
    }

}