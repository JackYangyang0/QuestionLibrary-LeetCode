package basic.two_pointers;

public class _977 {

    public int[] sortedSquares(int[] nums) {
        int r = 0;
        while (r < nums.length && nums[r] < 0) {
            r++;
        }
        int l = r - 1;
        int[] ans = new int[nums.length];
        int idx = 0;
        while (l >= 0 && r < nums.length) {
            int left = nums[l];
            int right = nums[r];
            if (left * left < right * right) {
                ans[idx++] = left * left;
                l--;
            } else {
                ans[idx++] = right * right;
                r++;
            }
        }
        while (l >= 0) {
            ans[idx++] = nums[l] * nums[l];
            l--;
        }

        while (r < nums.length) {
            ans[idx++] = nums[r] * nums[r];
            r++;
        }
        return ans;
    }
}
