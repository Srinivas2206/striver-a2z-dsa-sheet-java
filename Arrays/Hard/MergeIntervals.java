package Arrays.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<>();
        int n = intervals.length;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int[] curr = intervals[0];
        for (int i = 1; i < n; i++) {
            int[] next = intervals[i];
            if (next[0] <= curr[1]) {
                curr[1] = Math.max(curr[1], next[1]);
            } else {
                res.add(curr);
                curr = next;
            }
        }
        res.add(curr);
        return res.toArray(new int[res.size()][]);
    }
}
