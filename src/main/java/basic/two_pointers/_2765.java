package basic.two_pointers;

public class _2765 {

    public int alternatingSubarray(int[] nums) {
        int ans = 0;
        int n = nums.length;
        for (int i = 0; i < n; ) {
            int start = i;
            while (i < n - 1 && nums[i + 1] - nums[i] == (int)Math.pow(-1, (i - start))) {
                i++;
            }

            if (i - start > 1) {
                ans = Math.max(ans, i - start + 1);
            }
            i++;
        }
        return ans;
    }
}
