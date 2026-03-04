package BinarySearch.BSonAnswer;

public class ShipPackages {
    public int shipWithinDays(int[] weights, int days) {
        int low = Integer.MIN_VALUE;
        int high = 0;
        for (int wt : weights) {
            low = Math.max(low, wt);
            high += wt;
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canShip(weights, mid, days)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public boolean canShip(int[] weights, int w, int d) {
        int days = 1;
        int sum = 0;
        for (int i = 0; i < weights.length; i++) {

            if (sum + weights[i] > w) {
                days++;
                sum = weights[i];
            } else {
                sum += weights[i];
            }
            if (days > d) {
                return false;
            }
        }
        return true;
    }
}
