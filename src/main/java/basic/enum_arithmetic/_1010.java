package basic.enum_arithmetic;

import java.util.HashMap;
import java.util.Map;

public class _1010 {

    public int numPairsDivisibleBy60(int[] time) {
        long ans = 0;
        long[] cnt = new long[61];
        for (int t : time) {
            int r = t % 60;
            int target = 60 - r;
            ans += cnt[target];
            cnt[r]++;
        }
        ans += (cnt[0] * (cnt[0] - 1)) / 2;
        return (int)ans;
    }
}
