package BinarySearch.BSonAnswer;

public class FindNthRoot {
    public int NthRoot(int N, int M) {
        int low = 1;
        int high = M;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long val = power(mid, N, M);
            if (val == M)
                return mid;
            if (val < M)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1;
    }

    public long power(int num, int exp, int limit) {
        long result = 1;
        for (int i = 0; i < exp; i++) {
            result *= num;
            if (result > limit) {
                return result;
            }
        }
        return result;
    }
}
