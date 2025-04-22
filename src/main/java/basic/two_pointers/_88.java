package basic.two_pointers;

public class _88 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m + n];
        int idx = 0;
        int l = 0, r = 0;
        while (l < m && r < n) {
            if (nums1[l] <= nums2[r]) {
                temp[idx++] = nums1[l];
                l++;
            } else {
                temp[idx++] = nums2[r];
                r++;
            }
        }

        while (l < m) {
            temp[idx++] = nums1[l++];
        }

        while (r < n) {
            temp[idx++] = nums2[r++];
        }

        System.arraycopy(temp, 0, nums1, 0, m + n);
    }
}
