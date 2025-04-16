package basic.sliding_window;

public class _2379 {
    public int minimumRecolors(String blocks, int k) {
        int ans = Integer.MAX_VALUE;
        int total = 0; // 操作数
        for (int i = 0; i < blocks.length(); i++) {
            char c = blocks.charAt(i);
            if (c == 'W') {
                total++;
            }
            if (i < k - 1) {
                continue;
            }
            ans = Math.min(ans, total);
            char out = blocks.charAt(i - k + 1);
            if (out == 'W') {
                total--;
            }
        }
        return ans;
    }
}
