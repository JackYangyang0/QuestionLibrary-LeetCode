package basic.sliding_window;

import java.util.HashSet;
import java.util.Set;

public class _1461 {

    public boolean hasAllCodes(String s, int k) {
        Set<String> set = new HashSet<>();
        for (int i = k; i <= s.length(); i++) {
            String temp = s.substring(i - k, i);
            set.add(temp);
        }
        return set.size() == (1 << k);
    }
}