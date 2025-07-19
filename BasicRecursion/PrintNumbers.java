package BasicRecursion;

public class PrintNumbers {
    public void printNumbers(int n) {
        if (n == 0) {
            return;
        }
        printNumbers(n - 1);
        System.out.println(n);
    }
}
// Time Complexity: O(N)
// Space Complexity: O(N)