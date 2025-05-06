package basic.enum_arithmetic;

import java.util.PriorityQueue;

public class _2909 {

    public int minimumSum(int[] nums) {
        int ans = Integer.MAX_VALUE;
        int l = Integer.MAX_VALUE;
        int n = nums.length;
        int[] mins = new int[n];
        mins[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            mins[i] = Math.min(mins[i + 1], nums[i]);
        }

        int r = Integer.MAX_VALUE;
        for (int j = 1; j < n - 1; j++) {
            l = Math.min(l, nums[j - 1]);
            r = mins[j + 1];
            if (l < nums[j] && r < nums[j]) {
                ans = Math.min(ans, l + r + nums[j]);
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
