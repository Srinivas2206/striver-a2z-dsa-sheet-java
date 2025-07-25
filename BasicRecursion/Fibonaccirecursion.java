package BasicRecursion;

public class Fibonaccirecursion {
    public static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fib(4));
    }
}
// TC : O(2**n)
// SC: O(n)