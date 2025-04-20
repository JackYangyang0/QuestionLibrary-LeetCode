package basic.two_pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _18 {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < nums.length - 3; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j != i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                int d = nums.length - 1;
                for (int k = j + 1; k < nums.length - 1; k++) {
                    if (k != j + 1 && nums[k] == nums[k - 1]) {
                        continue;
                    }

                    while (k < d && (long)nums[i] + nums[j] + nums[k] + nums[d] > target) {
                        d--;
                    }

                    if (k == d) {
                        break;
                    }

                    if ((long)nums[i] + nums[j] + nums[k] + nums[d] == target) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add(nums[d]);
                        ans.add(temp);
                    }
                }
            }
        }
        return ans;
    }
}
