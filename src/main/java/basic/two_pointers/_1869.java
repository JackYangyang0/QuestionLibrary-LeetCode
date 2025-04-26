package basic.two_pointers;

public class _1869 {

    public boolean checkZeroOnes(String s) {
        int[] cnt = new int[2];
        int slow = 0, fast = 0;
        while (fast < s.length()) {
            if (s.charAt(slow) == s.charAt(fast)) {
                fast++;
            } else {
                slow = fast;
            }

            int x = (int)s.charAt(slow) - '0';
            cnt[x] = Math.max(cnt[x], fast - slow);
        }
        return cnt[0] < cnt[1];
    }
}
