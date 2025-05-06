package basic.enum_arithmetic;

public class _2874 {

    public long maximumTripletValue(int[] nums) {
        long ans = 0;
        long diff = nums[0] - nums[1];
        long mx = nums[0];
        for (int k = 2; k < nums.length; k++) {
            ans = Math.max(ans, diff * nums[k]);
            mx = Math.max(mx, nums[k - 1]);
            diff = Math.max(diff, mx - nums[k]);
        }
        return ans;
    }
}
