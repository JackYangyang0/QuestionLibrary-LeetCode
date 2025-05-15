package basic.stack;

import java.util.Deque;
import java.util.LinkedList;

public class _1003 {

    public boolean isValid(String s) {
        Deque<Character> stk = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'c') {
                if (stk.size() >= 2 && stk.peek() == 'b') {
                    stk.pop();
                    if (stk.peek() == 'a') {
                        stk.pop();
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                stk.push(s.charAt(i));
            }
        }
        return stk.isEmpty();
    }
}
