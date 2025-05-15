package basic.stack;

import java.util.Deque;
import java.util.LinkedList;

public class _2211 {

    public int countCollisions(String directions) {
        int ans = 0;
        int rcnt = directions.charAt(0) == 'R' ? 1 : 0;
        Deque<Character> stk = new LinkedList<>();
        stk.push(directions.charAt(0));
        for (int i = 1; i < directions.length(); i++) {
            char dir = directions.charAt(i);
            if (stk.peek() == 'R' && dir == 'L') {
                ans += 1 + rcnt;
                rcnt = 0;
                stk.push('S');
            } else if (stk.peek() == 'S' && dir == 'L'){
                ans += 1;
                stk.push('S');
            } else if (dir == 'S') {
                ans += rcnt;
                rcnt = 0;
                stk.push('S');
            } else {
                rcnt += dir == 'R' ? 1 : 0;
                stk.push(dir);
            }
        }

        return ans;
    }
}
