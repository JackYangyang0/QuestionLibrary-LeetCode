package basic.two_pointers;

import java.util.Arrays;

public class _1385 {

    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int ans = 0;
        for (int i = 0; i < arr1.length; i++) {
            boolean flag = true;
            for (int j = 0; j < arr2.length; j++) {
                if (Math.abs(arr1[i] - arr2[j]) > d) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                ans++;
            }
        }
        return ans;
    }


    public int findTheDistanceValue2(int[] arr1, int[] arr2, int d) {
        int ans = 0;
        Arrays.sort(arr2);
        for (int x : arr1) {
            int i = lowerBound(arr2, x - d);
            if (i == arr2.length || arr2[i] > x + d) {
                ans++;
            }
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
