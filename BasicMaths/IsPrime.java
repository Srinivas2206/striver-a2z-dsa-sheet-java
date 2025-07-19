package BasicMaths;

public class IsPrime {
    public boolean isPrime(int n) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                count++;
                if (n / i != i) {
                    count++;
                }
            }
        }

        if (count == 2)
            return true;
        return false;
    }
}

/*
 * Approach:
 * 
 * Initialise count = 0
 * for i=1 to sqrt of n:
 * - if n%i==0:
 * - - increment count
 * - - if i != n/i count++;
 * 
 * if count== return true
 * return false
 * 
 * 
 * TC: O(sqrt(n))
 * SC: O(1)
 */