package basic.sliding_window;

public class _643 {
    public double findMaxAverage(int[] nums, int k) {
        double ans = -1e4;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (i < k - 1) {
                continue;
            }
            ans = Math.max(ans, (double)sum / k);
            int out = nums[i - k + 1];
            sum -= out;
        }
        return ans;
    }
}
