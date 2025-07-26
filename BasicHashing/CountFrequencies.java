package BasicHashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountFrequencies {
    public static List<List<Integer>> countFrequencies(int[] nums) {
        // Your code goes here
        HashMap<Integer, Integer> mp = new HashMap<>();
        int n = nums.length;
        // precompute
        for (int i = 0; i < n; i++) {
            int key = nums[i];
            int freq = 0;
            if (mp.containsKey(key))
                freq = mp.get(key);
            freq++;
            mp.put(key, freq);
        }

        List<List<Integer>> res = new ArrayList<>();

        // fetch
        for (Map.Entry<Integer, Integer> it : mp.entrySet()) {
            List<Integer> pair = new ArrayList<>();
            pair.add(it.getKey());
            pair.add(it.getValue());
            res.add(pair);
        }
        return res;
    }
}
