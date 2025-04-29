package basic.enum_arithmetic;

import java.util.HashMap;
import java.util.Map;

public class _2001 {

    public long interchangeableRectangles(int[][] rectangles) {
        Map<Double, Integer> map = new HashMap<>();
        long ans = 0;
        for (int[] rectangle : rectangles) {
            double rate = (double)rectangle[0] / rectangle[1];
            if (map.containsKey(rate)) {
                ans += map.get(rate);
            }

            map.put(rate, map.getOrDefault(rate, 0) + 1);
        }
        return ans;
    }
}
