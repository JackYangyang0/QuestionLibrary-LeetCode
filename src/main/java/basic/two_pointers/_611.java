package basic.two_pointers;

import java.util.Arrays;

public class _611 {

    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        for (int a = 0; a < nums.length - 2; a++) {
            int c = a;
            for (int b = a + 1; b < nums.length - 1; b++) {
                while (c < nums.length && nums[c] < nums[a] + nums[b]) {
                    c++;
                }
                ans += Math.max(c - b - 1, 0);
            }
        }
        return ans;
    }
}
