package basic.sliding_window;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _2841 {
    public long maxSum(List<Integer> nums, int m, int k) {
        long ans = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int cnt = 0;
        long sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            int num = nums.get(i);
            sum += num;
            if (!map.containsKey(num)) {
                cnt++;
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (i < k - 1) {
                continue;
            }
            if (cnt >= m) {
                ans = Math.max(ans, sum);
            }
            int out = nums.get(i - k + 1);
            sum -= out;
            map.merge(out, -1, Integer::sum);
            if (map.get(out).equals(0)) {
                map.remove(out);
                cnt--;
            }
        }
        return ans;
    }
}
