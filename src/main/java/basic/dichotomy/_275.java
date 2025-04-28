package basic.dichotomy;

public class _275 {

    public int hIndex(int[] citations) {
        int n = citations.length;
        int l = 1, r = n + 1;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (citations[n - mid] >= mid) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l - 1;
    }
}
