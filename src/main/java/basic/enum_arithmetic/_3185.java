package basic.enum_arithmetic;

public class _3185 {

    public long countCompleteDayPairs(int[] hours) {
        long ans = 0;
        long[] cnt = new long[24];
        for (int hour : hours) {
            int r = hour % 24;
            int target = 24 - r;
            ans += cnt[target];
            cnt[r]++;
        }
        ans += (cnt[0] * (cnt[0] - 1)) / 2;
        return ans;
    }
}
