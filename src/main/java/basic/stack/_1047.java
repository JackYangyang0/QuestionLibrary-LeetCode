package basic.stack;

import java.util.Deque;
import java.util.LinkedList;

public class _1047 {

    public String removeDuplicates(String s) {
        StringBuilder ans = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (!ans.isEmpty() && c == ans.charAt(ans.length() - 1)) {
                ans.deleteCharAt(ans.length() - 1);
            } else {
                ans.append(c);
            }
        }
        return ans.toString();
    }
}
