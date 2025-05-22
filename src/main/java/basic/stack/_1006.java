package basic.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class _1006 {

    public int clumsy(int n) {
        Deque<Integer> stk = new ArrayDeque<>();
        stk.push(n);
        n--;

        int index = 0;
        while (n > 0) {
            if (index % 4 == 0) {
                stk.push(stk.pop() * n);
            } else if (index % 4 == 1) {
                stk.push(stk.pop() / n);
            } else if (index % 4 == 2) {
                stk.push(n);
            } else {
                stk.push(-n);
            }
            index++;
            n--;
        }

        int sum = 0;
        while (!stk.isEmpty()) {
            sum += stk.pop();
        }
        return sum;
    }
}
