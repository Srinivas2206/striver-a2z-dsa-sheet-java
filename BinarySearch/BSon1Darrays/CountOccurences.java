package BinarySearch.BSon1Darrays;

public class CountOccurences {
    public int countOccurrences(int[] arr, int target) {
        // Your code goes here
        int lower = lowerBound(arr, target);
        int upper = upperBound(arr, target);
        return upper - lower;
    }

    public int lowerBound(int[] arr, int target) {
        int low = 0;
        int high = arr.length;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    public int upperBound(int[] arr, int target) {
        int low = 0;
        int high = arr.length;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }
}
