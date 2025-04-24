package basic.two_pointers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _524 {

    public String findLongestWord(String s, List<String> dictionary) {
        String ans = "";
        int l = 0;
        for (String str : dictionary) {
            if (check(str, s)) {
                if (ans.length() <= str.length()) {
                    if (ans.length() == str.length()) {
                        ans = ans.compareTo(str) > 0 ? str : ans;
                    } else {
                        ans = str;
                    }
                }
            }
        }
        return ans;
    }

    private boolean check(String s, String target) {
        int i = 0, j = 0;
        while (i < s.length()) {
            while (j < target.length() && s.charAt(i) != target.charAt(j)) {
                j++;
            }
            if (j == target.length()) {
                return false;
            }
            i++;
            j++;
        }
        return true;
    }
}
