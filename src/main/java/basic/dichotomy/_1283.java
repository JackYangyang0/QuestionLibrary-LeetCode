package basic.dichotomy;

import java.util.Arrays;

public class _1283 {

    public int smallestDivisor(int[] nums, int threshold) {
        int mx = 0;
        for (int num : nums) {
            mx = Math.max(mx, num);
        }

        int l = 1, r = mx;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (check(nums, mid, threshold)) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }

    private boolean check(int[] nums, int d, int threshold) {
        int sum = 0;
        for (int num : nums) {
            sum += (num + d - 1) / d;
        }
        return sum > threshold;
    }
}
