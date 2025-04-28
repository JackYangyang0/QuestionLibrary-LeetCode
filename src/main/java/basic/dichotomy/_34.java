package basic.dichotomy;

public class _34 {

    public int[] searchRange(int[] nums, int target) {
        int l = 0, r = nums.length;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] >= target) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }

        if (l == nums.length || nums[l] != target) {
            return new int[]{-1, -1};
        }

        for (int i = l; i < nums.length; i++) {
            if (nums[i] != target) {
                return new int[]{l, i - 1};
            }
        }
        return new int[]{l, r};
    }
}
