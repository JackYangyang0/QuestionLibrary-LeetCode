package basic.stack;

import java.util.Deque;
import java.util.LinkedList;

public class _20 {

    public boolean isValid(String s) {
        Deque<Character> stk = new LinkedList<>();
        for (char c : s.toCharArray()) {
            if (c == ')') {
                if (stk.isEmpty() ||stk.pop() != '(') {
                    return false;
                }
            } else if (c == ']') {
                if (stk.isEmpty() || stk.pop() != '[') {
                    return false;
                }
            } else if (c == '}') {
                if (stk.isEmpty() || stk.pop() != '{') {
                    return false;
                }
            } else {
                stk.push(c);
            }
        }
        return stk.isEmpty();
    }
}
