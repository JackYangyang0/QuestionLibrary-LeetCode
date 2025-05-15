package basic.stack;

import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;

public class _735 {

    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stk = new LinkedList<>();
        for (int a : asteroids) {
            if (stk.isEmpty()) {
                stk.push(a);
            } else {
                if (a < 0 && stk.peek() > 0) {
                    while (!stk.isEmpty() && stk.peek() > 0 && -a > stk.peek()) {
                        stk.pop();
                    }

                    if (stk.isEmpty() || stk.peek() < 0) {
                        stk.push(a);
                    } else if (a == -stk.peek()) {
                        stk.pop();
                        continue;
                    }
                } else {
                    stk.push(a);
                }
            }
        }
        int[] ans = new int[stk.size()];
        for (int i = stk.size() - 1; i >= 0; i--) {
            ans[i] = stk.pop();
        }
        return ans;
    }
}
