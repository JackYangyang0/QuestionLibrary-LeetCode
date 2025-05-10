package basic.prefix;

public class _3070 {

    public int countSubmatrices(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        int[][] prefix = new int[m + 1][n + 1];
        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                prefix[i + 1][j + 1] = prefix[i + 1][j] + prefix[i][j + 1] - prefix[i][j] + grid[i][j];
                if (prefix[i + 1][j + 1] <= k) {
                    ans++;
                }
            }
        }
        return ans;
    }
}
