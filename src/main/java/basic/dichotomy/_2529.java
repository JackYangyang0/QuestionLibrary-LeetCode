package basic.dichotomy;

public class _2529 {

    public int maximumCount(int[] nums) {
        int neg = lowerBound(nums, 0);
        int pos = lowerBound(nums, 1);

        return Math.max(neg, nums.length - pos);
    }

    private int lowerBound(int[] nums, int target) {
        int l = 0, r = nums.length;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }
}
