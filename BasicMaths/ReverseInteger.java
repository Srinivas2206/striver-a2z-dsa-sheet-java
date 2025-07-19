package BasicMaths;

public class ReverseInteger {
    public static int reverseNumber(int n) {
        int rev = 0;
        while (n > 0) {
            int lastdigit = n % 10;
            rev = rev * 10 + lastdigit;
            n = n / 10;
        }
        return rev;
    }
}

/*
 * Approach:
 * 
 * 1. initialise reverse = 0
 * 2. while number > 0 {
 * - set lastdigit = number%10
 * - number = number/10
 * - reverse = reverse*10 + lastdigit
 * }
 * 3. return reverse
 * 
 * Time Complexity : O(log10 n)
 * Space Complexity : O(1)
 */