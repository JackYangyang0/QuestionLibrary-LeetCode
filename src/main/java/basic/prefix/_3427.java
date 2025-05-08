package basic.prefix;

public class _3427 {

    public int subarraySum(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            int l = Math.max(0, i - nums[i]);
            while (l <= i) {
                sum += nums[l++];
            }
        }
        return sum;
    }
}
