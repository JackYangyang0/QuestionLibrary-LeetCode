package basic.stack;

import java.util.ArrayList;
import java.util.List;

public class _1441 {

    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<>();
        int idx = 0, num = 1;
        while (num <= n) {
            ans.add("Push");
            if (num == target[idx]) {
                idx++;
            } else {
                ans.add("Pop");
            }
            if (idx == target.length) {
                return ans;
            }
            num++;
        }
        return ans;
    }
}
