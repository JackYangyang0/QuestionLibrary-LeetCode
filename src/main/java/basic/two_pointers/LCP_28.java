package basic.two_pointers;

import java.util.Arrays;

public class LCP_28 {

    public int purchasePlans(int[] nums, int target) {
        Arrays.sort(nums);
        int MOD = 1000000007;
        long ans = 0;
        int l = 0, r = nums.length - 1;
        while (l < r) {
            if (nums[l] + nums[r] <= target) {
                l++;
            } else {
                r--;
            }
            ans += l;
        }
        return (int) (ans % MOD);
    }
}
