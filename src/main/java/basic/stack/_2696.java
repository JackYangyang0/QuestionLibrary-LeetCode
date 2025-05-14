package basic.stack;

import java.util.ArrayList;
import java.util.List;

public class _2696 {

    public int minLength(String s) {
        List<Character> list = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (!list.isEmpty() && c == 'B' && list.getLast() == 'A') {
                list.removeLast();
            } else if (!list.isEmpty() && c == 'D' && list.getLast() == 'C') {
                list.removeLast();
            } else {
                list.add(c);
            }
        }
        return list.size();
    }
}
