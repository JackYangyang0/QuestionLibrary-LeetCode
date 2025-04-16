package basic.sliding_window;

public class _1652 {

    public int[] decrypt(int[] code, int k) {
        if (k == 0) {
            return new int[code.length];
        }
        int sum = 0;
        int n = code.length;
        int r = k > 0 ? k + 1 : n;
        k = Math.abs(k);
        for (int i = r - k; i < r; i++) {
            sum += code[i];
        }
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = sum;
            sum += code[r % n] - code[(r - k) % n];
            r++;
        }
        return ans;
    }
}
