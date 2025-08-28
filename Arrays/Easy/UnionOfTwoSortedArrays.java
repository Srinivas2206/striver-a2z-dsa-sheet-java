import java.util.ArrayList;
import java.util.List;

public class UnionOfTwoSortedArrays {
    public static int[] unionArray(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int i = 0;
        int j = 0;
        List<Integer> temp = new ArrayList<>();

        while (i < n1 && j < n2) {
            if (nums1[i] <= nums2[j]) {
                if (temp.size() == 0 || temp.get(temp.size() - 1) != nums1[i]) {
                    temp.add(nums1[i]);
                }
                i++;
            } else {
                if (temp.size() == 0 || temp.get(temp.size() - 1) != nums2[j]) {
                    temp.add(nums2[j]);
                }
                j++;
            }
        }

        while (i < n1) {
            if (temp.size() == 0 || temp.get(temp.size() - 1) != nums1[i]) {
                temp.add(nums1[i]);
            }
            i++;
        }

        while (j < n2) {
            if (temp.size() == 0 || temp.get(temp.size() - 1) != nums2[j]) {
                temp.add(nums2[j]);
            }
            j++;
        }
        int[] union = new int[temp.size()];
        for (int k = 0; k < union.length; k++) {
            union[k] = temp.get(k);
        }

        return union;
    }

    public static void main(String[] args) {
        int[] nums1 = { 3, 4, 6, 7, 9, 9 };
        int[] nums2 = { 1, 5, 7, 8, 8 };
        int[] res = unionArray(nums1, nums2);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }

    }
}