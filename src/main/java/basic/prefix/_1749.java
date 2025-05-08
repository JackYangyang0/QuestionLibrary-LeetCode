package basic.prefix;

public class _1749 {

    public int maxAbsoluteSum(int[] nums) {
        int s = 0, mx = 0, mn = 0;
        for (int num : nums) {
            s += num;
            if (s > mx) {
                mx = s;
            } else if (s < mn) {
                mn = s;
            }
        }
        return mx - mn;
    }
}
