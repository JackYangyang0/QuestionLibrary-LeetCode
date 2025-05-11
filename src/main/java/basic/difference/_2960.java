package basic.difference;

public class _2960 {

    public int countTestedDevices(int[] batteryPercentages) {
        int ans = 0;
        for (int battery : batteryPercentages) {
            battery -= ans;
            if (battery > 0) {
                ans++;
            }
        }
        return ans;
    }
}
