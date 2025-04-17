package basic.sliding_window;

import java.util.HashMap;
import java.util.Map;

public class _2958 {

    public int maxSubarrayLength(int[] nums, int k) {
        int ans = 0;
        Map<Integer, Integer> windows = new HashMap<>();

        for (int l = 0, r = 0; r < nums.length; r++) {
            int num = nums[r];

            windows.put(num, windows.getOrDefault(num, 0) + 1);

            while (windows.get(num) > k) {
                int out = nums[l++];
                windows.merge(out, -1, Integer::sum);
                if (windows.get(out).equals(0)) {
                    windows.remove(out);
                }
            }

            ans = Math.max(ans, r - l + 1);
        }
        return ans;
    }
}
