package basic.two_pointers;

import java.util.Collections;
import java.util.List;

public class _2824 {

    public int countPairs(List<Integer> nums, int target) {
        int ans = 0;
        for (int i = 0; i < nums.size() - 1; i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) < target) {
                    ans++;
                }
            }
        }
        return ans;
    }

    public int countPairs2(List<Integer> nums, int target) {
        Collections.sort(nums);
        int l = 0, r = nums.size() - 1;
        int ans = 0;
        while (l < r) {
            if (nums.get(l) + nums.get(r) < target) {
                l++;
            } else {
                r--;
            }
            ans += l;
        }
        return ans;
    }
}
