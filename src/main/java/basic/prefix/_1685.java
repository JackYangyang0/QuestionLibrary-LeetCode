package basic.prefix;

public class _1685 {

    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int[] prefix = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        for (int i = 0; i < n; i++) {
            int p = nums[i] * i - prefix[i];
            int b = (prefix[n] - prefix[i]) - nums[i] * (n - i);
            ans[i] = p + b;
        }
        return ans;
    }
}
