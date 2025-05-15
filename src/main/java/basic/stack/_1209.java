package basic.stack;

import java.util.Deque;
import java.util.LinkedList;

public class _1209 {

    public String removeDuplicates(String s, int k) {
        StringBuilder str = new StringBuilder(s);
        int[] cnts = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || str.charAt(i) != str.charAt(i - 1)) {
                cnts[i] = 1;
            } else {
                cnts[i] = cnts[i - 1] + 1;

                if (cnts[i] == k) {
                    str.delete(i - k + 1, i + 1);
                    i = i - k;
                }

            }
        }
        return str.toString();
    }

    public String removeDuplicates2(String s, int k) {
        StringBuilder str = new StringBuilder(s);
        Deque<Integer> stk = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || str.charAt(i) != str.charAt(i - 1)) {
                stk.push(1);
            } else {
                stk.push(stk.pop() + 1);

                if (!stk.isEmpty() && stk.peek() == k) {
                    str.delete(i - k + 1, i + 1);
                    stk.pop();
                    i = i - k;
                }
            }
        }
        return str.toString();
    }
}
