package BinarySearch.BSonAnswer;

public class MinimizeMaxDistance {
    public double minimiseMaxDistance(int[] arr, int k) {
        double low = 0.0;
        double high = 0;
        for (int i = 1; i < arr.length; i++) {
            high = Math.max(high, arr[i] - arr[i - 1]);
        }

        while (high - low > 1e-6) {
            double mid = (low + high) / 2;
            if (canPlace(arr, mid, k)) {
                high = mid;
            } else {
                low = mid;
            }
        }
        return high;
    }

    public boolean canPlace(int[] arr, double d, int k) {
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            double gap = arr[i] - arr[i - 1];
            count += (int) Math.ceil(gap / d) - 1;
            if (count > k) {
                return false;
            }
        }
        return true;
    }
}
