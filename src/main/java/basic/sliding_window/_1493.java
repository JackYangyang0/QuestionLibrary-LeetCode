package basic.sliding_window;

public class _1493 {
    public int longestSubarray(int[] nums) {
        int ans = 0;
        int cnt = 0;
        for (int l = 0, r = 0; r < nums.length; r++) {
            int num = nums[r];

            if (num == 0) {
                cnt++;
            }

            while (cnt > 1) {
                int out = nums[l++];
                if (out == 0) {
                    cnt--;
                }
            }

            ans = Math.max(ans, r - l);
        }
        return ans;
    }
}
