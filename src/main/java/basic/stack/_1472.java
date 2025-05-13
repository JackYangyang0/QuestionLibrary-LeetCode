package basic.stack;

import java.util.ArrayList;
import java.util.List;

public class _1472 {

    class BrowserHistory {
        List<String> stk;
        int cur;
        public BrowserHistory(String homepage) {
            stk = new ArrayList<>();
            stk.add(homepage);
            cur = 0;
        }

        public void visit(String url) {
            cur++;
            stk.subList(cur, stk.size()).clear();
            stk.add(url);
        }

        public String back(int steps) {
            cur = Math.max(cur - steps, 0);
            return stk.get(cur);
        }

        public String forward(int steps) {
            cur = Math.min(cur + steps, stk.size() - 1);
            return stk.get(cur);
        }
    }
}
