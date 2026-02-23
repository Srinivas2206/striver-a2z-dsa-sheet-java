public class CountInversions {
    public long numberOfInversions(int[] nums) {
        int n = nums.length;
        int[] temp = new int[n];
        long count = mergeSort(nums, temp, 0, n - 1);
        return count;
    }

    private long mergeSort(int[] nums, int[] temp, int low, int high) {
        if (low >= high)
            return 0;

        int mid = low + (high - low) / 2;
        long inv = 0;
        inv += mergeSort(nums, temp, low, mid);
        inv += mergeSort(nums, temp, mid + 1, high);
        inv += merge(nums, temp, low, mid, high);

        return inv;
    }

    private long merge(int[] nums, int[] temp, int low, int mid, int high) {
        int left = low;
        int right = mid + 1;
        int i = low;
        long inv = 0;

        while (left <= mid && right <= high) {
            if (nums[left] <= nums[right]) {
                temp[i++] = nums[left++];
            } else {
                temp[i++] = nums[right++];
                inv += (mid - left + 1);
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

        return inv;
    }
}
