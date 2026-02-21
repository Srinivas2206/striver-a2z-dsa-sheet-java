package Arrays.Hard;

import java.util.HashMap;

public class CountSubarraysWithXOREqualsK {
    public int subarraysWithXorK(int[] nums, int k) {
        int count = 0;
        int xor = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int num : nums) {
            xor ^= num;
            int need = xor ^ k;
            count += map.getOrDefault(need, 0);
            map.put(xor, map.getOrDefault(xor, 0) + 1);
        }
        return count;
    }
}
