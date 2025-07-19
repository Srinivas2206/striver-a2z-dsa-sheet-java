package BasicMaths;

public class IsArmStrong {
    public boolean isArmstrong(int n) {
        int copy = n;
        int sum = 0;
        int len = (int) Math.log10(n) + 1;
        while (n > 0) {
            int lastdigit = n % 10;
            n = n / 10;
            sum += Math.pow(lastdigit, len);
        }

        if (copy == sum)
            return true;
        else
            return false;
    }
}

/*
 * Approach:
 * Set length = (int) Math.log10(n)+1;
 * set copy = n
 * initialise sum = 0
 * while (n>0)
 * - lastdigit = n%10
 * - sum += Math.pow(lastdigit, length)
 * - n = n/10
 * 
 * if sum==copy return true
 * else return false
 * 
 * 
 * TC: O(log10 n)
 * SC: O(1)
 */