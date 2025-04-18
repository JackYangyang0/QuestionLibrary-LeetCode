package basic.sliding_window;

public class _2730 {
    public int longestSemiRepetitiveSubstring(String s) {
        int ans = 0;
        int valid = 0;
        char rprev = 0;
        char lprev = 0;
        for (int l = 0, r = 0; r < s.length(); r++) {
            char c = s.charAt(r);

            if (c == rprev) {
                valid++;
            }

            while (valid > 1) {
                lprev = s.charAt(l++);
                char out = s.charAt(l);
                if (out == lprev) {
                    valid--;
                }
            }

            ans = Math.max(ans, r - l + 1);
            rprev = c;
        }
        return ans;
    }
}
