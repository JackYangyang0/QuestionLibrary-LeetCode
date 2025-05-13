package basic.stack;

import java.util.LinkedList;
import java.util.List;

public class _844 {

    public boolean backspaceCompare(String s, String t) {
        List<Character> stk1 = getList(s);
        List<Character> stk2 = getList(t);

        if (stk1.size() != stk2.size()) {
            return false;
        }

        for (int i = 0; i < stk1.size(); i++) {
            if (!stk1.get(i).equals(stk2.get(i))) {
                return false;
            }
        }
        return true;
    }

    private List<Character> getList(String s) {
        List<Character> list = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '#' && list.size() > 0) {
                list.removeLast();
            } else if (c != '#'){
                list.addLast(c);
            }
        }
        return list;
    }
}
