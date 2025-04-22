package basic.two_pointers;

public class _922 {

    public int[] sortArrayByParityII(int[] nums) {
        int[] ans = new int[nums.length];
        int event = 0, odd = 1;

        for (int num : nums) {
            if (num % 2 == 0) {
                ans[event] = num;
                event += 2;
            } else {
                ans[odd] = num;
                odd += 2;
            }
        }
        return ans;
    }

    public int[] sortArrayByParityII2(int[] nums) {
        int event = 0, odd = 1;
        while (event < nums.length) {
            if (nums[event] % 2 == 0) {
                event += 2;
            } else if (nums[odd] %  2 != 0) {
                odd += 2;
            } else {
                int temp = nums[event];
                nums[event] = nums[odd];
                nums[odd] = temp;
                event += 2;
                odd += 2;
            }
        }
        return nums;
    }

}
