package BasicHashing;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MostFrequentElement {
    public static int mostFrequentElement(int[] nums) {

        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int num : nums) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }

        int max_freq = Collections.max(mp.values());
        int min_num = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> it : mp.entrySet()) {
            if (it.getValue() == max_freq) {
                min_num = Math.min(min_num, it.getKey());
            }
        }

        return min_num;
    }
}
