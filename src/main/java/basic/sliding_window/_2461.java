package basic.sliding_window;

import java.util.HashMap;
import java.util.Map;

public class _2461 {
    public long maximumSubarraySum(int[] nums, int k) {
        long ans = 0;
        long sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if (i < k - 1) {
                continue;
            }

            if (map.size() == k) {
                ans = Math.max(ans, sum);
            }
            int out = nums[i - k + 1];
            sum -= out;
            map.merge(out, -1, Integer::sum);
            if (map.get(out).equals(0)) {
                map.remove(out);
            }
        }
        return ans;
    }
}
