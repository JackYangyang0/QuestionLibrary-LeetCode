package basic.sliding_window;

public class _209 {

    public int minSubArrayLen(int target, int[] nums) {
        int ans = Integer.MAX_VALUE;
        int sum = 0;
        for (int l = 0, r = 0; r < nums.length; r++) {
            int num = nums[r];
            sum += num;

            while (target <= sum) {
                ans = Math.min(ans, r - l + 1);
                int out = nums[l++];
                sum -= out;
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}
