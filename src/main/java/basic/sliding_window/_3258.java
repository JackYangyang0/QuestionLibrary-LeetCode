package basic.sliding_window;

public class _3258 {

    public int countKConstraintSubstrings(String s, int k) {
        int[] sum = new int[2];
        int ans = 0;
        for (int l = 0, r = 0; r < s.length(); r++) {
            char c = s.charAt(r);

            sum[c - '0']++;

            while (sum[0] > k && sum[1] > k) {
                char out = s.charAt(l++);
                sum[out - '0']--;
            }

            ans += r - l + 1;
        }
        return ans;
    }
}
