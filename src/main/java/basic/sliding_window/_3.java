package basic.sliding_window;

import java.util.HashSet;
import java.util.Set;

public class _3 {

    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        Set<Character> set = new HashSet<>();
        for (int l = 0, r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            while (set.contains(c)) {
                char out = s.charAt(l++);
                set.remove(out);
            }
            set.add(c);
            ans = Math.max(ans, set.size());
        }
        return ans;
    }
}
