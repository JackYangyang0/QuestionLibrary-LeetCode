package basic.stack;

import java.util.ArrayList;
import java.util.List;

public class _946 {

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int n = pushed.length;
        List<Integer> stk = new ArrayList<>();
        int i = 0, j = 0;
        while (i < n) {
            stk.add(pushed[i]);
            while (!stk.isEmpty() && stk.getLast() == popped[j]) {
                stk.removeLast();
                j++;
            }
            i++;
        }

        return stk.isEmpty();
    }
}
