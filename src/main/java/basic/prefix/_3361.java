package basic.prefix;

public class _3361 {

    public long shiftDistance(String s, String t, int[] nextCost, int[] previousCost) {
        final int SIGMA = 26;
        long[] preSum = new long[SIGMA * 2 + 1];
        long[] nxSum = new long[SIGMA * 2 + 1];
        for (int i = 0; i < SIGMA * 2; i++) {
            preSum[i + 1] = preSum[i] + previousCost[i % SIGMA];
            nxSum[i + 1] = nxSum[i] + nextCost[i % SIGMA];
        }

        long ans = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            int x = s.charAt(i) - 'a';
            int y = t.charAt(i) - 'a';
            ans += Math.min(preSum[(x < y ? x + SIGMA : x) + 1] - preSum[y + 1],
                    nxSum[y < x ? y + SIGMA : y] - nxSum[x]);
        }
        return ans;
    }

    public long shiftDistance2(String s, String t, int[] nextCost, int[] previousCost) {
        long ans = 0;

        for (int i = 0; i < s.length(); i++) {
            int x = s.charAt(i) - 'a';
            int y = t.charAt(i) - 'a';
            long nxc = 0, prec = 0;
            int tempx = x, tempy = x > y ? y + 26 : y;
            while (tempx != tempy) {
                nxc += nextCost[tempx % 26];
                tempx++;
            }
            tempx = x < y ? x + 26 : x;
            tempy = y;
            while (tempx != tempy) {
                prec += previousCost[tempx % 26];
                tempx--;
            }
            ans += Math.min(nxc, prec);
        }
        return ans;
    }
}