package BasicRecursion;

public class PrintNumbersNto1 {
    public void printNumbers(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNumbers(n - 1);
    }
}
// TC: O(N)
// SC:O(N)