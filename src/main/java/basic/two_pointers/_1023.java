package basic.two_pointers;

import java.util.ArrayList;
import java.util.List;

public class _1023 {

    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> ans = new ArrayList<>();
        for (String query : queries) {
            if (check(query, pattern)) {
                ans.add(true);
            } else {
                ans.add(false);
            }
        }
        return ans;
    }

    private boolean check(String s, String target) {
        int i = 0, j = 0;
        while (j < target.length()) {
            while (i < s.length() && s.charAt(i) != target.charAt(j)) {
                if (Character.isUpperCase(s.charAt(i))) {
                    return false;
                }
                i++;
            }

            if (i == s.length()) {
                return false;
            }
            j++;
            i++;
        }

        while (i < s.length()) {
            if (Character.isUpperCase(s.charAt(i++))) {
                return false;
            }
        }
        return true;
    }
}
