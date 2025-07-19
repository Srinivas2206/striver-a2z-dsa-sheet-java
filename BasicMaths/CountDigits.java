package BasicMaths;

import java.util.Scanner;

public class CountDigits {
    public static int countDigit(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = countDigit(n);
        System.out.println(cnt);
    }
}

/*
 * Problem: Count digits in a number
 * Link: Striver A2Z DSA Sheet - Basic Maths
 * Approach:
 * 1. Initialize count = 0
 * 2. While number > 0
 * - Increment count
 * - Divide number by 10
 * 3. Return count
 * 
 * Time Complexity: O(log₁₀N)
 * Space Complexity: O(1)
 */
