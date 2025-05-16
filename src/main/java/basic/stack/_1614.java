package basic.stack;

import java.util.Deque;
import java.util.LinkedList;

public class _1614 {

    public int maxDepth(String s) {
        int ans = 0;
        Deque<Character> stk = new LinkedList<>();
        for (char c : s.toCharArray()) {
            if (c == ')') {
                stk.pop();
            }

            if (c == '(') {
                stk.push(c);
            }
            ans = Math.max(ans, stk.size());
        }
        return ans;
    }
}
