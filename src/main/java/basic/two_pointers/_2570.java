package basic.two_pointers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _2570 {

    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
       int[] cnt = new int[1001];
       int n = 0;
       for (int[] nums : nums1) {
           cnt[nums[0]] += nums[1];
           n++;
       }

       for (int[] nums : nums2) {
           if (cnt[nums[0]] == 0) {
               n++;
           }
           cnt[nums[0]] += nums[1];
       }

       int[][] ans = new int[n][2];
       int idx = 0;
       for (int i = 0; i < 1001; i++) {
           if (cnt[i] == 0) {
               continue;
           }
           ans[idx][0] = i;
           ans[idx][1] = cnt[i];
           idx++;
       }
        return ans;
    }

    public int[][] mergeArrays2(int[][] nums1, int[][] nums2) {
        ArrayList<int[]> list = new ArrayList<>();
        for (int i = 0, j = 0; i < nums1.length || j < nums2.length; ) {
            if (j >= nums2.length) {
                list.add(nums1[i++]);
            } else if (i >= nums1.length) {
                list.add(nums2[j++]);
            } else if (nums1[i][0] < nums2[j][0]) {
                list.add(nums1[i++]);
            } else if (nums1[i][0] > nums2[j][0]) {
                list.add(nums2[j++]);
            } else {
                list.add(new int[]{nums1[i][0], nums1[i++][1] + nums2[j++][1]});
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}
