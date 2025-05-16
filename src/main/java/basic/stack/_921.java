package basic.stack;

import java.util.Deque;
import java.util.LinkedList;

public class _921 {

    public int minAddToMakeValid(String s) {
        int ans = 0;
        Deque<Character> stk = new LinkedList<>();
        for (char c : s.toCharArray()) {
            if (c == ')') {
                if (stk.isEmpty() ||stk.peek() != '(') {
                    ans++;
                } else {
                    stk.pop();
                }
            } else {
                stk.push(c);
            }
        }
        return ans + stk.size();
    }
}
