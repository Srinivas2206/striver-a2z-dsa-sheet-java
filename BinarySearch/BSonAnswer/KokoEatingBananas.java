package BinarySearch.BSonAnswer;

public class KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
        int max = piles[0];
        for (int num : piles) {
            max = Math.max(max, num);
        }
        int ans = max;
        int low = 1;
        int high = max;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canEat(piles, mid, h)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public boolean canEat(int[] piles, int k, int h) {
        int n = piles.length;
        long count = 0;
        for (int i = 0; i < n; i++) {
            count += (piles[i] + k - 1) / k;
            if (count > h)
                return false;
        }
        return count <= h;
    }
}
