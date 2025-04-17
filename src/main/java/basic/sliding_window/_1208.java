package basic.sliding_window;

public class _1208 {
    public int equalSubstring(String s, String t, int maxCost) {
        int ans = 0;
        int cost = 0;
        for (int l = 0, r = 0; r < s.length(); r++) {
            char c1 = s.charAt(r);
            char c2 = t.charAt(r);

            cost += Math.abs(c1 - c2);

            while (cost > maxCost) {
                char out1 = s.charAt(l);
                char out2 = t.charAt(l);
                cost -= Math.abs(out1 - out2);
                l++;
            }

            ans = Math.max(ans, r - l + 1);
        }
        return ans;
    }
}
