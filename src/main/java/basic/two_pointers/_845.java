package basic.two_pointers;

public class _845 {

    public int longestMountain(int[] arr) {
        int ans = 0;
        int l = 0;
        while (l + 2 < arr.length) {
            int  r = l + 1;
            if (arr[l] < arr[l + 1]) {
                while (r < arr.length - 1 && arr[r] < arr[r + 1]) {
                    r++;
                }

                if (r < arr.length - 1 && arr[r] > arr[r + 1]) {
                    while (r < arr.length - 1 && arr[r] > arr[r + 1]) {
                        r++;
                    }
                    ans = Math.max(ans, r - l + 1);
                } else {
                    ++r;
                }
            }
            l = r;
        }
        return ans;
    }
}
