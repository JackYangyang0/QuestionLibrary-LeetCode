package basic.sliding_window;

public class _713 {

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k < 1) {
            return 0;
        }
        long multi = 1;
        int ans = 0;
        for (int l = 0, r = 0; r < nums.length; r++) {
            int num = nums[r];

            multi *= num;

            while (l <= r && multi >= k) {
                int out = nums[l++];
                multi /= out;
            }

            ans += r - l + 1;
        }
        return ans;
    }
}
