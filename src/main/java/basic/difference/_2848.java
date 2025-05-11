package basic.difference;
import java.util.List;

public class _2848 {

    public int numberOfPoints(List<List<Integer>> nums) {
        int[] diff = new int[101];
        int mx = 0;
        for (List<Integer> num : nums) {
            int s = num.get(0), e = num.get(1);
            diff[s]++;
            diff[e + 1]--;
            mx = Math.max(mx, e);
        }
        int ans = 0;
        int sum = 0;
        for (int i = 1; i <= mx; i++) {
            sum += diff[i];
            if (sum != 0) {
                ans++;
            }
        }
        return ans;
    }
}
