package basic.two_pointers;

import java.util.Arrays;

public class _2563 {

    public long countFairPairs(int[] nums, int lower, int upper) {
        long ans = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            ans += lowerBound(nums, i, upper - num + 1) - lowerBound(nums, i, lower - num);
        }

        return ans;
    }

    private int lowerBound(int[] nums, int r, int target) {
        int l = 0;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }
}
