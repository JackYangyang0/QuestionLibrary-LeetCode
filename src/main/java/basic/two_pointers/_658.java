package basic.two_pointers;

import java.util.ArrayList;
import java.util.List;

public class _658 {

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int r = lowerBound(arr, x);
        int l = r - 1;
        List<Integer> ans = new ArrayList<>();
        while (k-- > 0) {
            if (l < 0) {
                r++;
            } else if (r >= arr.length) {
                l--;
            } else if (x - arr[l] <= arr[r] - x) {
                l--;
            } else {
                r++;
            }
        }
        for (int i = l + 1; i < r; i++) {
            ans.add(arr[i]);
        }
        return ans;
    }


    private int lowerBound(int[] nums, int target) {
        int l = 0, r = nums.length;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }
}
