package Arrays.Hard;

public class ReversePairs {
    class Solution {
        public int reversePairs(int[] nums) {
            int[] temp = new int[nums.length];
            return mergeSort(nums, temp, 0, nums.length - 1);
        }

        public int mergeSort(int[] nums, int[] temp, int low, int high) {
            if (low >= high)
                return 0;

            int mid = low + (high - low) / 2;
            int count = 0;
            count += mergeSort(nums, temp, low, mid);
            count += mergeSort(nums, temp, mid + 1, high);
            count += merge(nums, temp, low, mid, high);

            return count;
        }

        public int merge(int[] nums, int[] temp, int low, int mid, int high) {
            int count = 0;
            int left = low;
            int right = mid + 1;

            int i = low;
            int k = left;
            int m = right;
            while (k <= mid && m <= high) {
                if ((long) nums[k] > (long) 2 * nums[m]) {
                    count += (mid - k + 1);
                    m++;
                } else {
                    k++;
                }

            }
            while (left <= mid && right <= high) {

                if (nums[left] <= nums[right]) {
                    temp[i++] = nums[left++];
                } else {
                    temp[i++] = nums[right++];
                }
            }

            while (left <= mid) {
                temp[i++] = nums[left++];
            }

            while (right <= high) {
                temp[i++] = nums[right++];
            }

            for (i = low; i <= high; i++) {
                nums[i] = temp[i];
            }

            return count;
        }
    }
}
