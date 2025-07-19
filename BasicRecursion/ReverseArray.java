package BasicRecursion;

public class ReverseArray {
    public static void reverse(int[] arr, int n) {
        reverseHelper(arr, 0, n - 1);
    }

    private static void reverseHelper(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }

        // swap
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        reverseHelper(arr, left + 1, right - 1);
    }
}
