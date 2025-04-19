package basic.two_pointers;

import java.util.Arrays;

public class _1471 {

    public int[] getStrongest(int[] arr, int k) {
        int[] ans = new int[k];
        Arrays.sort(arr);
        int n = arr.length;
        int m = arr[(n - 1) / 2];
        int[] temp = new int[n];
        int idx = 0;
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            if (m - arr[l] <= arr[r] - m) {
                temp[idx] = arr[r];
                r--;
            } else {
                temp[idx] = arr[l];
                l++;
            }
            idx++;
        }
        System.arraycopy(temp, 0, ans, 0, k);
        return ans;
    }
}
