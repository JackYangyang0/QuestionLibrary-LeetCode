package basic.difference;

public class _3355 {

    public boolean isZeroArray(int[] nums, int[][] queries) {
        int[] diff = new int[nums.length + 1];
        for (int[] query : queries) {
            int l = query[0], r = query[1];
            diff[l]--;
            diff[r + 1]++;
        }

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += diff[i];
            nums[i] += sum;
            if (nums[i] > 0) {
                return false;
            }
        }
        return true;
    }
}
