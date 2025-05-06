package basic.enum_arithmetic;
import java.util.List;
public class _624 {

    public int maxDistance(List<List<Integer>> arrays) {
        int ans = 0;
        int mx = Integer.MIN_VALUE, mn = Integer.MAX_VALUE;
        for (List<Integer> array : arrays) {
            int x = array.get(array.size() - 1);
            int y = array.get(0);
            ans = Math.max(ans, Math.max(mx - y, x - mn));
            mx = Math.max(x, mx);
            mn = Math.min(y, mn);
        }
        return ans;
    }
}
