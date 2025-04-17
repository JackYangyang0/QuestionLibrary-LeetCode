package basic.sliding_window;

import java.util.HashSet;
import java.util.Set;

public class _1695 {

    public int maximumUniqueSubarray(int[] nums) {
        int ans = 0;
        Set<Integer> set = new HashSet<>();
        int sum = 0;

        for (int l = 0, r = 0; r < nums.length; r++) {
            int num =  nums[r];
            sum += num;
            while (set.contains(num)) {
                int out = nums[l++];
                set.remove(out);
                sum -= out;
            }

            set.add(num);
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}
