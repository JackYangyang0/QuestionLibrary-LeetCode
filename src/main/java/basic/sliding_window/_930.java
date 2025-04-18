package basic.sliding_window;

public class _930 {

    public int numSubarraysWithSum(int[] nums, int goal) {
        return windows(nums, goal) - windows(nums, goal + 1);
    }

    private int windows(int[] nums, int goal) {
        int ret = 0;
        int sum = 0;
        for (int l = 0, r = 0; r < nums.length; r++) {
            int num = nums[r];

            sum += num;

            while (l <= r && sum >= goal) {
                sum -= nums[l++];
            }

            ret += l;
        }
        return ret;
    }
}