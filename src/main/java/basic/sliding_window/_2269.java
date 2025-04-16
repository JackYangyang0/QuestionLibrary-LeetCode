package basic.sliding_window;

public class _2269 {

    public int divisorSubstrings(int num, int k) {
        String str = String.valueOf(num);
        int ans = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i < k - 1) {
                continue;
            }
            String temp = str.substring(i - k + 1, i + 1);
            int x = Integer.parseInt(temp);
            if (x != 0 && num % x == 0) {
                ans++;
            }
        }
        return ans;
    }
}
