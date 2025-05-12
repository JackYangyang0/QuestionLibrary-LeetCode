package basic.difference;

public class _1094 {

    public boolean carPooling(int[][] trips, int capacity) {
        int mx = 0;
        int[] diff = new int[1001];
        for (int[] trip : trips) {
            int cnt = trip[0], from = trip[1], to = trip[2];
            diff[from] += cnt;
            diff[to] -= cnt;
            mx = Math.max(mx, to);
        }

        int sum = 0;
        for (int i = 0; i <= mx; i++) {
            sum += diff[i];
            if (sum > capacity) {
                return false;
            }
        }
        return true;
    }
}
