package basic.stack;

import java.util.ArrayList;
import java.util.List;

public class _3412 {

    public long calculateScore(String s) {
        List<Integer>[] cnt = new List[26];
        long ans = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int idx = c - 'a';
            if (cnt[25 - idx] != null && cnt[25 - idx].size() != 0) {
                List<Integer> list = cnt[25 - idx];
                Integer j = list.removeLast();
                ans += i - j;
                continue;
            }

            List<Integer> temp = cnt[idx] == null ? new ArrayList<Integer>() : cnt[idx];
            temp.add(i);
            cnt[idx] = temp;
        }
        return ans;
    }
}
