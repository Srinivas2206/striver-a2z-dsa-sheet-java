import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top = 0;
        int right = matrix[0].length - 1;
        int left = 0;
        int bottom = matrix.length - 1;
        List<Integer> res = new ArrayList<>();
        while (top <= bottom && left <= right) {
            // traversing from left to right
            for (int i = left; i <= right; i++) {
                res.add(matrix[top][i]);
            }
            top++;
            // traversing from top to bottom
            for (int i = top; i <= bottom; i++) {
                res.add(matrix[i][right]);
            }
            right--;
            // traversing from right to left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    res.add(matrix[bottom][i]);
                }
                bottom--;
            }
            // traversing from bottom to top

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    res.add(matrix[i][left]);
                }
                left++;
            }
        }

        return res;

    }
}
