package basic.two_pointers;

public class _1446 {
    public int maxPower(String s) {
        int ans = 0;
        int slow = 0, fast = 0;
        while (fast < s.length()) {
            if (s.charAt(slow) == s.charAt(fast)) {
                fast++;
                ans = Math.max(ans, fast - slow);
            } else {
                slow = fast;
            }
        }
        return ans;
    }
}
