package basic.sliding_window;

public class _2904 {

    public String shortestBeautifulSubstring(String s, int k) {
        int len = Integer.MAX_VALUE;
        int start = 0;
        int cnt = 0;
        for (int l = 0, r = 0; r < s.length(); r++) {
            char c = s.charAt(r);

            if (c == '1') {
                cnt++;
            }

            while (cnt == k) {
                if (len >= r - l + 1) {
                    if (len == r - l + 1 && s.substring(start, start + len).compareTo(s.substring(l, r + 1)) < 0) {
                    } else {
                        start = l;
                        len = Math.min(len, r - l + 1);
                    }
                }
                char out = s.charAt(l++);
                if (out == '1') {
                    cnt--;
                }
            }
        }
        return len == Integer.MAX_VALUE ? "" : s.substring(start, start + len);
    }
}
