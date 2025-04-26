package basic.two_pointers;

public class _2760 {

    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int ans = 0;
        int l = 0, r = 0;
        while (r < nums.length) {
            if (nums[r] > threshold || nums[r] % 2 != 0) {
                r++;
                continue;
            }

            l = r;
            r++;
            while (r < nums.length && nums[r] <= threshold && nums[r] % 2 != nums[r - 1] % 2) {
                r++;
            }
            ans = Math.max(ans, r - l);
        }
        return ans;
    }
}
