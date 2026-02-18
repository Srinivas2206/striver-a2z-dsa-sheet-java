package Arrays.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if (numRows >= 1)
            res.add(Arrays.asList(1));
        if (numRows >= 2)
            res.add(Arrays.asList(1, 1));

        for (int i = 3; i <= numRows; i++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prev = res.get(i - 2);

            row.add(1);

            for (int j = 0; j < prev.size() - 1; j++) {
                row.add(prev.get(j) + prev.get(j + 1));
            }

            row.add(1);

            res.add(row);
        }

        return res;
    }
}
