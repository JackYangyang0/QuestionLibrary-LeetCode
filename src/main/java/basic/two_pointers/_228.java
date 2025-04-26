package basic.two_pointers;

import java.util.ArrayList;
import java.util.List;

public class _228 {

    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        int l = 0, r = 1;
        while (r < nums.length) {
            if (nums[r] - nums[r - 1] != 1) {
                if (l == r - 1) {
                    ans.add(String.valueOf(nums[l]));
                } else {
                    ans.add(nums[l] + "->" + nums[r - 1]);
                }
                l = r;
            }
            r++;
        }
        ans.add(l == r - 1 ? String.valueOf(nums[l]) : nums[l] + "->" + nums[r - 1]);
        return ans;
    }
}
