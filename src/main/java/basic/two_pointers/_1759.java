package basic.two_pointers;

import java.util.HashMap;
import java.util.Map;

public class _1759 {

    public int countHomogenous(String s) {
        int l = 0, r = 0;
        int MOD = 1000000007;
        int n = s.length();
        char[] ch = s.toCharArray();
        long ans = 0;
        while (r < n) {
            while (r + 1 < n && ch[r] == ch[r + 1]) {
                r++;
            }

            int x = r - l + 1;
            ans += (long)(x + 1) * x / 2;
            r++;
            l = r;
        }
        return (int)(ans % MOD);
    }
}
