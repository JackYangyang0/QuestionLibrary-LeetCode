package basic.enum_arithmetic;

import java.util.HashMap;
import java.util.Map;

public class _1512 {

    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for (int num : nums) {
            if (map.containsKey(num)) {
                ans += map.get(num);
            }

            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return ans;
    }
}
