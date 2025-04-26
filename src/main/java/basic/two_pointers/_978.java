package basic.two_pointers;

public class _978 {

    public int maxTurbulenceSize(int[] arr) {
        int ans = 1;
        int l = 0, r = 0;
        while (r < arr.length - 1) {
            if (l == r) {
                if (arr[l] == arr[l + 1]) {
                    l++;
                }
                r++;
            } else {
                if (arr[r] > arr[r + 1] && arr[r] > arr[r - 1]) {
                    r++;
                } else if (arr[r] < arr[r + 1] && arr[r] < arr[r - 1]) {
                    r++;
                } else {
                    l = r;
                }
            }
            ans = Math.max(ans, r - l + 1);
        }
        return ans;
    }
}
