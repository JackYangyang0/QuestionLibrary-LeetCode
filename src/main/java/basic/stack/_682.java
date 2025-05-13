package basic.stack;

import java.util.ArrayList;
import java.util.List;

public class _682 {

    public int calPoints(String[] operations) {
        int ans = 0;
        List<Integer> me = new ArrayList<>();
        for (String o : operations) {
            switch (o) {
                case "C" -> {
                    ans -= me.getLast();
                    me.removeLast();
                }
                case "D" -> {
                    me.add(me.getLast() * 2);
                    ans += me.getLast();
                }
                case "+" -> {
                    me.add(me.get(me.size() - 1) + me.get(me.size() - 2));
                    ans += me.getLast();
                }
                default -> {
                    me.add(Integer.valueOf(o));
                    ans += me.getLast();
                }
            }
        }
        return ans;
    }
}
