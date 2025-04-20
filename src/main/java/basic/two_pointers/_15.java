package basic.two_pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _15 {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int k = nums.length - 1;
            int target = -nums[i];
            for (int j = i + 1; j < nums.length - 1; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                while (j < k && nums[j] + nums[k] > target) {
                    k--;
                }

                if (j == k) {
                    break;
                }

                if (nums[j] + nums[k] == target) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    ans.add(temp);
                }
            }
        }
        return ans;
    }
}
