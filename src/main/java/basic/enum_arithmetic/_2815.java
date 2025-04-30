package basic.enum_arithmetic;

public class _2815 {

    public int maxSum(int[] nums) {
            int ans = 0;
            int[] mx = new int[10];
            for (int num : nums) {
                int idx = 0;
                int temp = num;
                while (temp > 0) {
                    idx = Math.max(idx, temp % 10);
                    temp /= 10;
                }
                ans = Math.max(ans, mx[idx] + num);
                mx[idx] = Math.max(mx[idx], num);
            }
            return ans;
    }
}
