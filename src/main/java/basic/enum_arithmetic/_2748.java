package basic.enum_arithmetic;

public class _2748 {

    public int countBeautifulPairs(int[] nums) {
        int[] cnt = new int[10];
        int ans = 0;
        for (int num : nums) {
            int x = num % 10;
            for (int i = 0; i < 10; i++) {
                if (cnt[i] != 0 && gcd(i, x) == 1) {
                    ans += cnt[i];
                }
            }
            while (num != 0) {
                x = num % 10;
                num /= 10;
            }
            cnt[x]++;
        }
        return ans;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
