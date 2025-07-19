package BasicRecursion;

public class NNumbersSum {
    public int NnumbersSum(int N) {
        if (N == 0) {
            return 0;
        }
        return N + NnumbersSum(N - 1);
    }
}
// TC: O(N)
// SC: O(N)