package basic.two_pointers;

import java.util.Arrays;

public class LCP_18 {

    public int breakfastNumber(int[] staple, int[] drinks, int x) {
        int MOD = 1000000007;
        Arrays.sort(drinks);
        Arrays.sort(staple);

        long ans = 0;
        for (int i = 0, j = drinks.length - 1; i < staple.length; i++) {
            int sum = staple[i];
            while (j >= 0) {
                sum += drinks[j];
                if (sum > x) {
                    sum -= drinks[j];
                    j--;
                } else {
                    break;
                }
            }
            ans += j + 1;
        }
        return (int)(ans % MOD);
    }
}
