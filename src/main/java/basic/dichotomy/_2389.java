package basic.dichotomy;

import java.util.Arrays;

public class _2389 {

    public int[] answerQueries(int[] nums, int[] queries) {
        int n = queries.length;
        int[] ans = new int[n];
        int[] prefix = new int[nums.length + 1];
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            prefix[i + 1] = nums[i] + prefix[i];
        }
        for (int i = 0; i < n; i++) {
            ans[i] = upperBound(prefix, queries[i]) - 1;
        }
        return ans;
    }

    private int upperBound(int[] nums, int target) {
        int l = 0, r = nums.length;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] > target) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
}
