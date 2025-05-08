package basic.prefix;

public class _303 {

    class NumArray {
        int[] prefix;
        public NumArray(int[] nums) {
            int n = nums.length;
            prefix = new int[n + 1];
            for (int i = 0; i < n; i++) {
                prefix[i + 1] = prefix[i] + nums[i];
            }
        }

        public int sumRange(int left, int right) {
            return prefix[right + 1] - prefix[left];
        }
    }
}


