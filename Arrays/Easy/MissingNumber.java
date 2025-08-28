public class MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int xor = 0;

        for (int it : nums) {
            xor ^= it;
        }

        for (int i = 0; i <= n; i++) {
            xor ^= i;
        }

        return xor;
    }
}
