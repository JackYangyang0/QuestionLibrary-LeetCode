package basic.stack;

import java.util.Deque;
import java.util.LinkedList;

public class _1021 {

    public String removeOuterParentheses(String s) {
         int l = 1;
         Deque<Character> stk = new LinkedList<>();
         StringBuilder str = new StringBuilder();
         for (int i = 0; i < s.length(); i++) {
             char c = s.charAt(i);
             if (c == ')') {
                 stk.pop();
                 if (stk.isEmpty()) {
                     str.append(s, l, i);
                     l = i + 2;
                 }
             } else {
                 stk.push(c);
             }
         }
         return str.toString();
    }
}
