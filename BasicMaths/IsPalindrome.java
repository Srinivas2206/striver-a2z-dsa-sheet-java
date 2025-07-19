package BasicMaths;

import java.util.Scanner;

public class IsPalindrome {
    public static boolean isPalindrome(int n) {
        int copy = n;
        int rev = 0;
        while (n > 0) {
            int lastdigit = n % 10;
            n = n / 10;
            rev = (rev * 10) + lastdigit;
        }

        if (rev == copy)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPalindrome(n));
    }
}

/*
 * Approach:
 * 
 * Set copy = number
 * initialise reverse = 0
 * while number > 0 :
 * - lastdigit = number%10
 * - rev = rev*10 + lastdigit
 * - number = number/10
 * 
 * if rev = copy return true
 * else return false
 * 
 * 
 * TC: O(log10 n)
 * SC: O(1)
 */