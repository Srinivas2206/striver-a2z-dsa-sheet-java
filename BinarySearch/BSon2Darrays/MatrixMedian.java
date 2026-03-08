package BinarySearch.BSon2Darrays;

public class MatrixMedian {
    public int findMedian(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int low = matrix[0][0];
        int high = matrix[0][n - 1];

        for (int i = 1; i < m; i++) {
            low = Math.min(low, matrix[i][0]);
            high = Math.max(high, matrix[i][n - 1]);
        }

        while (low < high) {
            int mid = low + (high - low) / 2;
            int count = 0;
            for (int i = 0; i < m; i++) {
                count += countLessEqual(matrix[i], mid);
            }

            if (count < (m * n + 1) / 2) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }

    public int countLessEqual(int[] row, int num) {
        int low = 0;
        int high = row.length;

        while (low < high) {
            int m = (low + high) / 2;
            if (row[m] <= num) {
                low = m + 1;
            } else {
                high = m;
            }
        }
        return low;
    }
}
