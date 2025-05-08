package basic.prefix;

public class _3152 {

    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n = queries.length;
        boolean[] ans = new boolean[n];

        int[] prefix = new int[nums.length];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + (nums[i - 1] % 2 == nums[i] % 2 ? 1 : 0);
        }

        for (int i = 0; i < n; i++) {
            int l = queries[i][0], r = queries[i][1];
            ans[i] = prefix[r] == prefix[l];
        }
        return ans;
    }
}
