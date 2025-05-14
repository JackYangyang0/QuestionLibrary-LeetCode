package basic.stack;

import java.util.LinkedList;
import java.util.List;

public class _71 {

    public String simplifyPath(String path) {
        String[] strs = path.split("/");
        StringBuilder ans = new StringBuilder();
        List<String> stk = new LinkedList<>();
        for (String s : strs) {
            if (s.isEmpty()) {
                continue;
            }

            if (s.equals("..")) {
                if (!stk.isEmpty()) {
                    stk.removeLast();
                }
            } else if (s.equals(".")) {
                continue;
            } else {
                stk.add(s);
            }
        }

        if (stk.isEmpty()) {
            ans.append("/");
        }

        for (String s : stk) {
            ans.append("/").append(s);
        }
        return ans.toString();
    }
}
