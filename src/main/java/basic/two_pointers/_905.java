package basic.two_pointers;

public class _905 {

    public int[] sortArrayByParity(int[] nums) {
        int[] ans = new int[nums.length];
        int event = 0, odd = nums.length - 1;
        for (int num : nums) {
            if (num % 2 == 0) {
                ans[event++] = num;
            } else {
                ans[odd--] = num;
            }
        }

        return ans;
    }

    public int[] sortArrayByParity2(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        while (i < j) { // 循环直到不足两个数
            if (nums[i] % 2 == 0) { // 寻找最左边的奇数
                i++;
            } else if (nums[j] % 2 == 1) { // 寻找最右边的偶数
                j--;
            } else {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
                // 交换后，问题变成 [i+1,j-1] 的子问题
                i++;
                j--;
            }
        }
        return nums;
    }
}
