package basic.two_pointers;

public class _2110 {

    public long getDescentPeriods(int[] prices) {
        long ans = 1;
        int l = 0, r = 1;
        while (r < prices.length) {
            if (prices[r - 1] - prices[r] != 1) {
                l = r;
            }
            ans += r - l + 1;
            r++;
        }
        return ans;
    }
}
