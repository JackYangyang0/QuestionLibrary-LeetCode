package basic.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class _856 {

    public int scoreOfParentheses(String s) {
        if (s.length() == 2) {
            return 1;
        }

        int bal = 0, len = 0, n = s.length();
        for (int i = 0; i < n; i++) {
            bal += s.charAt(i) == '(' ? 1 : -1;
            if (bal == 0) {
                len = i + 1;
                break;
            }
        }

        if (len == n) {
            return 2 * scoreOfParentheses(s.substring(1, n - 1));
        } else {
            return scoreOfParentheses(s.substring(0, len)) + scoreOfParentheses(s.substring(len));
        }
    }

    public int scoreOfParentheses2(String s) {
        Deque<Integer> stk = new ArrayDeque<>();
        stk.push(0);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stk.push(0);
            } else {
                int v = stk.pop();
                int top = stk.pop() + Math.max(2 * v, 1);
                stk.push(top);
            }
        }
        return stk.peek();
    }
}
