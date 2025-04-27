package basic.two_pointers;

import java.util.HashSet;
import java.util.Set;

public class _1839 {

    public int longestBeautifulSubstring(String word) {
        int ans = 0;
        char[] ch = word.toCharArray();
        int n = ch.length;
        for (int i = 0; i < n; i++) {
            Set<Character> set = new HashSet<>();
            int start = i;
            set.add(ch[i]);
            while (i < n - 1 && ch[i] <= ch[i + 1]) {
                set.add(ch[i + 1]);
                i++;
            }

            if (set.size() == 5) {
                ans = Math.max(ans, i - start + 1);
            }
        }
        return ans;
    }
}
