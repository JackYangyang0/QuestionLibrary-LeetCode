package basic.enum_arithmetic;

import java.util.HashMap;
import java.util.Map;

public class _1679 {

    public int maxOperations(int[] nums, int k) {
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(k - num)) {
                ans++;
                map.merge(k - num, -1, Integer::sum);
                if (map.get(k - num).equals(0)) {
                    map.remove(k - num);
                }
                continue;
            }

            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return ans;
    }
}
