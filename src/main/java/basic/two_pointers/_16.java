package basic.two_pointers;

import java.util.Arrays;

public class _16 {

    public int threeSumClosest(int[] nums, int target) {
        int ans = 0;
        int diff = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int k = nums.length - 1;

            for (int j = i + 1; j < nums.length - 1; j++) {
                if (j != i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                while (j < k && nums[j] + nums[k] > target - nums[i]) {
                    if (Math.abs(nums[i] + nums[j] + nums[k] - target) < diff) {
                        diff = Math.abs(nums[i] + nums[j] + nums[k] - target);
                        ans = nums[i] + nums[j] + nums[k];
                    }
                    k--;
                }

                if (j == k) {
                    break;
                }


                if (Math.abs(nums[i] + nums[j] + nums[k] - target) < diff) {
                    diff = Math.abs(nums[i] + nums[j] + nums[k] - target);
                    ans = nums[i] + nums[j] + nums[k];
                }
            }

        }
        return ans;
    }
}
