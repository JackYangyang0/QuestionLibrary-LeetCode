package basic.prefix;

public class _1893 {

    public boolean isCovered(int[][] ranges, int left, int right) {
        int[] diff = new int[52];
        for (int[] range : ranges) {
            int l = range[0], r = range[1];
            diff[l]++;
            diff[r + 1]--;
        }

        int sum = 0;
        for (int i = 1; i <= right; i++) {
            sum += diff[i];
            if (i >= left && sum == 0) {
                return false;
            }
        }
        return true;
    }
}
