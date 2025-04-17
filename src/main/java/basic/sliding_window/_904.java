package basic.sliding_window;

import java.util.HashMap;
import java.util.Map;

public class _904 {

    public int totalFruit(int[] fruits) {
        int ans = 0;
        Map<Integer, Integer> windows = new HashMap<>();
        for (int l = 0, r = 0; r < fruits.length; r++) {
            int fruit = fruits[r];

            windows.put(fruit, windows.getOrDefault(fruit, 0) + 1);

            while (windows.size() > 2) {
                int out = fruits[l++];
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
