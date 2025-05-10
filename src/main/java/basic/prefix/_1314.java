package basic.prefix;

public class _1314 {

    public int[][] matrixBlockSum(int[][] mat, int k) {
        int m = mat.length, n = mat[0].length;
        int[][] prefix = new int[m + 1][n + 1];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                prefix[i + 1][j + 1] = prefix[i + 1][j] + prefix[i][j + 1] - prefix[i][j] + mat[i][j];
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int row1 = Math.max(i - k, 0);
                int col1 = Math.max(j - k, 0);
                int row2 = Math.min(m - 1, i + k);
                int col2 = Math.min(n - 1, j + k);
                mat[i][j] = prefix[row2 + 1][col2 + 1] - prefix[row2 + 1][col1] - prefix[row1][col2 + 1] + prefix[row1][col1];
            }
        }
        return mat;
    }
}
