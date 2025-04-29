package basic.enum_arithmetic;

import java.util.HashMap;
import java.util.Map;

public class _1128 {

    public int numEquivDominoPairs(int[][] dominoes) {
        int[][] cnt = new int[10][10];
        int ans = 0;
        for (int[] domino : dominoes) {
            int min = Math.min(domino[0], domino[1]);
            int max = Math.max(domino[0], domino[1]);
            ans += cnt[min][max]++;
        }
        return ans;
    }
}
