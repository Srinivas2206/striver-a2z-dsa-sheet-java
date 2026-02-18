package Arrays.Hard;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementII {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int ele1 = 0, ele2 = 0;
        int count1 = 0, count2 = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (count1 == 0 && nums[i] != ele2) {
                ele1 = nums[i];
                count1 = 1;
            } else if (count2 == 0 && nums[i] != ele1) {
                ele2 = nums[i];
                count2 = 1;
            } else if (nums[i] == ele1) {
                count1++;
            } else if (nums[i] == ele2) {
                count2++;
            } else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == ele1) {
                count1++;
            } else if (nums[i] == ele2) {
                count2++;
            }
        }
        if (count1 > n / 3)
            res.add(ele1);
        if (count2 > n / 3)
            res.add(ele2);

        return res;
    }
}
