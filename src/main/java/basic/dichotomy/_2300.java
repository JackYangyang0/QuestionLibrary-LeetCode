package basic.dichotomy;

import java.util.Arrays;

public class _2300 {

    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int[] ans = new int[spells.length];
        for (int i = 0; i < spells.length; i++) {
            int cnt = lowerBound(potions, (double)success / spells[i]);
            ans[i] = potions.length - cnt;
        }
        return ans;
    }

    private int lowerBound(int[] nums, double target) {
        int l = 0, r = nums.length;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }
}
