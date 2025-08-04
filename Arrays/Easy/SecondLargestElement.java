public class SecondLargestElement {
    public int secondLargestElement(int[] nums) {
        int largest = nums[0];
        int slargest = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                slargest = largest;
                largest = nums[i];
            } else if (nums[i] < largest && nums[i] > slargest) {
                slargest = nums[i];
            }
        }
        return slargest;
    }
}
