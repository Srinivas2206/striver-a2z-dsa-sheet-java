package BinarySearch.BSon2Darrays;

public class FindRowWithMaximumOnes {
    public int rowWithMax1s(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int row = 0;
        int col = n - 1;
        int ans = -1;
        while (row < m && col >= 0) {
            if (mat[row][col] == 1) {
                ans = row;
                col--;
            } else {
                row++;
            }
        }
        return ans;
    }
}
