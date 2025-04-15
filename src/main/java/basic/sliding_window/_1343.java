package basic.sliding_window;

public class _1343 {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int ans = 0;
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (i < k - 1) {
                continue;
            }
            if (sum / k >= threshold) {
                ans++;
            }
            int out = arr[i - k + 1];
            sum -= out;
        }
        return ans;
    }
}
