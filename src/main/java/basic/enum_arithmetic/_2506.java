package basic.enum_arithmetic;

import java.util.HashMap;
import java.util.Map;

public class _2506 {

    public int similarPairs(String[] words) {
        Map<String, Integer> map = new HashMap<>();
        int ans = 0;
        for (String word : words) {
            int[] letter = new int[26];
            for (char c : word.toCharArray()) {
                letter[c - 'a']++;
            }
            StringBuilder str = new StringBuilder();
            for (int l : letter) {
                if (l != 0) {
                    str.append((char)(l + 'a'));
                }
            }
            String s = str.toString();
            ans += map.getOrDefault(s, 0);
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        return ans;
    }
}
