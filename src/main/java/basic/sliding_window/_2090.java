package basic.sliding_window;

import java.util.Arrays;

public class _2090 {
    public int[] getAverages(int[] nums, int k) {
        long sum = 0;
        int[] ans = new int[nums.length];
        Arrays.fill(ans, -1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (i < 2 * k) {
                continue;
            }
            ans[i - k] = (int) (sum / (2 * k + 1));
            int out = nums[i - 2 * k];
            sum -= out;
        }
        return ans;
    }
}
