import java.util.Scanner;

public class SelectionSort {

    public static int[] selectionSort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i <= n - 2; i++) {
            int min_idx = i;
            for (int j = i; j <= n - 1; j++) {
                if (nums[j] < nums[min_idx])
                    min_idx = j;
            }
            int temp = nums[min_idx];
            nums[min_idx] = nums[i];
            nums[i] = temp;
        }

        return nums;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        arr = selectionSort(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}