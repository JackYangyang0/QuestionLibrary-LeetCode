package basic.difference;

public class _1854 {

    public int maximumPopulation(int[][] logs) {
        final int S = 1950;
        int[] diff = new int[101];
        for (int[] log : logs) {
            int b = log[0] - S, d = log[1] - S;
            diff[b]++;
            diff[d]--;
        }

        int sum = 0;
        int mx = 0;
        int ans = 0;
        for (int i = 0; i < 101; i++) {
            sum += diff[i];
            if (mx < sum) {
                mx = sum;
                ans = i + S;
            }
        }
        return ans;
    }
}
