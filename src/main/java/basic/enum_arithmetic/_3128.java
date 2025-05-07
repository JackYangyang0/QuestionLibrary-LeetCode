package basic.enum_arithmetic;

import java.util.Arrays;

public class _3128 {

    /**
     可以提前统计每一列为1的数量，进行预处理，从而每次遍历直角的那一个角
     最终可以简化为
     每一行的数量 - 1 -> rowSum - 1
     每一列的数量 - 1 -> columnSum - 1
     即 SUM((rowSum - 1) * (columnSum - 1))
     */
    public long numberOfRightTriangles(int[][] grid) {
        long ans = 0;
        int n = grid.length, m = grid[0].length;
        int[] cols = new int[m];
        Arrays.fill(cols, -1); // 提前-1
        for (int[] row : grid) {
            for (int j = 0; j < m; j++) {
                cols[j] += row[j];
            }
        }

        for (int[] row : grid) {
            int rowSum = -1;
            for (int num : row) {
                rowSum += num;
            }

            for (int j = 0; j < m; j++) {
                if (row[j] == 1) {
                    ans += (long) rowSum * cols[j];
                }
            }

        }
        return ans;
    }
}
