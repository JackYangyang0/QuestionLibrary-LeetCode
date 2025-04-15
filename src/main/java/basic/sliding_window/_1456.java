package basic.sliding_window;

public class _1456 {
    public int maxVowels(String s, int k) {
        int ans = 0;
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (check(c)) {
                sum++;
            }
            if (i < k - 1) {
                continue;
            }

            ans = Math.max(ans, sum);
            char out = s.charAt(i - k + 1);
            if (check(out)) {
                sum--;
            }
        }
        return ans;
    }

    private boolean check(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
