package BinarySearch.BSonAnswer;

public class PaintersPartition {
    public int paint(int A, int B, int[] C) {
        // Your code goes here
        long mod = 10000003;
        long low = 0;
        long high = 0;

        for (int c : C) {
            low = Math.max(low, c);
            high += c;
        }

        while (low <= high) {
            long mid = low + (high - low) / 2;
            if (canPaint(C, A, mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return (int) ((low * B) % mod);
    }

    public boolean canPaint(int[] C, int A, long maxLen) {
        int painters = 1;
        long curr = 0;
        for (int c : C) {
            if (curr + c <= maxLen) {
                curr += c;
            } else {
                painters++;
                curr = c;
                if (painters > A)
                    return false;
            }
        }
        return true;
    }
}
