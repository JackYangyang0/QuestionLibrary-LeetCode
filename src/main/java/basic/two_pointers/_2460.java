package basic.two_pointers;

public class _2460 {

    public int[] applyOperations(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
        }

        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[idx] = nums[i];
                idx++;
            }
        }

        while (idx < nums.length) {
            nums[idx++] = 0;
        }
        return nums;
    }
}
