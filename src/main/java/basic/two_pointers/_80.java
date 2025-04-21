package basic.two_pointers;

public class _80 {

    public int removeDuplicates(int[] nums) {
        int stackSize = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[stackSize - 2] != nums[i]) {
                nums[stackSize++] = nums[i];
            }
        }
        return Math.min(stackSize, nums.length);
    }
}
