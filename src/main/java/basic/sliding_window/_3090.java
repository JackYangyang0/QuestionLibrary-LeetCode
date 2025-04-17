package basic.sliding_window;

import java.util.HashMap;
import java.util.Map;

public class _3090 {
    public int maximumLengthSubstring(String s) {
        int ans = 0;
        Map<Character, Integer> windows = new HashMap<>();
        for (int l = 0, r = 0; r < s.length(); r++) {
            char c = s.charAt(r);

            windows.put(c, windows.getOrDefault(c, 0) + 1);

            while (windows.get(c) > 2) {
                char out = s.charAt(l++);
                windows.put(out, windows.get(out) - 1);
            }

            ans = Math.max(ans, r - l + 1);
        }
        return ans;
    }
}
