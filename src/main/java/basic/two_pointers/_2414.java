package basic.two_pointers;

public class _2414 {

    public int longestContinuousSubstring(String s) {
        char[] ch = s.toCharArray();
        int ans = 1;
        int cnt = 1;
        for (int i = 1; i < ch.length; i++) {
            if (ch[i - 1] + 1 == ch[i]) {
                ans = Math.max(ans, ++cnt);
            } else {
                cnt = 1;
            }
        }
        return ans;
    }
}
