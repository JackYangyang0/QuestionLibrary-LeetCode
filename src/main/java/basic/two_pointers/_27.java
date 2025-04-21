package basic.two_pointers;

public class _27 {

    public int removeElement(int[] nums, int val) {
        int cur = 0, r = nums.length - 1;

        while (cur <= r) {
            if (nums[cur] == val) {
                nums[cur] = nums[r];
                r--;
            } else {
                cur++;
            }
        }
        return cur;
    }
}
