package basic.enum_arithmetic;

import java.util.HashMap;
import java.util.Map;

public class _2342 {

    public int maximumSum(int[] nums) {
        int ans = -1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            int sum = 0;
            int temp = num;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            if (map.containsKey(sum)) {
                ans = Math.max(ans, num + map.get(sum));
                map.put(sum, Math.max(map.get(sum), num));
            } else {
                map.put(sum, num);
            }
        }
        return ans;
    }
}
