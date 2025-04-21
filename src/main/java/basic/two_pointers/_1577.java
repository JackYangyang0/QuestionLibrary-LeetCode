package basic.two_pointers;

import java.util.HashMap;
import java.util.Map;

public class _1577 {

    public int numTriplets(int[] nums1, int[] nums2) {
        Map<Long, Integer> map1 = new HashMap<>();
        Map<Long, Integer> map2 = new HashMap<>();
        createMap(nums1, map1);
        createMap(nums2, map2);
        int ans = 0;
        for (int num : nums1) {
            ans += map2.getOrDefault((long)num * num, 0);
        }

        for (int num : nums2) {
            ans += map1.getOrDefault((long)num * num, 0);
        }
        return ans;
    }

    private void createMap(int[] nums, Map<Long, Integer> map) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                long multi = (long)nums[i] * nums[j];
                map.put(multi, map.getOrDefault(multi, 0) + 1);
            }
        }
    }
}
