package BasicMaths;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Divisors {
    public int[] divisors(int n) {
        List<Integer> smallDivisors = new ArrayList<>();
        List<Integer> largeDivisors = new ArrayList<>();

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                smallDivisors.add(i);
                if (i != n / i) {
                    largeDivisors.add(n / i);
                }
            }
        }

        Collections.reverse(largeDivisors);
        smallDivisors.addAll(largeDivisors);

        int[] res = new int[smallDivisors.size()];

        for (int i = 0; i < smallDivisors.size(); i++) {
            res[i] = smallDivisors.get(i);
        }

        return res;
    }
}

/*
 * Approach;
 * 
 * Declare ArrayList smallDivisors
 * Declare ArrayList largeDivisors
 * 
 * 
 * - for i=0 to sqrt(n):
 * - - if (n%i==0)
 * - - - add i to smallDivisors
 * - - - if (i!=n/i) add n/i to largeDivisors
 * 
 * 
 * reverse the largeDivisors
 * append the largeDivisors to the smallDivisors
 * initialise result array of smallDivisors length
 * for i to smallDivisorslength
 * - add each elememt of smallDivisors to result
 * 
 * return result
 * 
 * TC: O(sqrt(n))
 * SC: O(sqrt(n))
 */