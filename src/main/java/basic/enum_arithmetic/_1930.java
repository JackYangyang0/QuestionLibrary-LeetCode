package basic.enum_arithmetic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _1930 {

    public int countPalindromicSubsequence(String s) {
        int ans = 0;
        int[] pre = new int[26];
        int[] suf = new int[26];
        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            suf[c - 'a']++;
        }

        Set<String> set = new HashSet<>();
        for (int i = 1; i < s.length(); i++) {
            pre[s.charAt(i - 1) - 'a']++;
            suf[s.charAt(i) - 'a']--;
            for (int j = 0; j < 26; j++) {
                String temp = new String(new char[]{(char)(j + 'a'), s.charAt(i), (char)(j + 'a')});
                if (pre[j] > 0 && suf[j] > 0 && !set.contains(temp)) {
                    ans++;
                    set.add(temp);
                }
            }
        }
        return ans;
    }
}
