package Arrays.Hard;

import java.util.HashMap;

public class LargestSubarrayWithSumZero {
    public int maxLen(int[] arr) {
        // Your code goes here
        int maxLen = 0;
        int n = arr.length;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == 0) {
                maxLen = i + 1;
            }
            if (map.containsKey(sum)) {
                maxLen = Math.max(maxLen, i - map.get(sum));
            }
            map.putIfAbsent(sum, i);

        }
        return maxLen;
    }
}
