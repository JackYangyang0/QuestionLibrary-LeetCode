package basic.dichotomy;

import java.util.Arrays;

public class _1170 {

    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] W = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            W[i] = f(words[i]);
        }

        Arrays.sort(W);
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int query = f(queries[i]);
            ans[i] = W.length - upperBound(W, query);
        }
        return ans;
    }

    private int upperBound(int[] nums, int target) {
        int l = 0, r = nums.length;
        while (l < r){
            int mid = l + (r - l) / 2;
            if (nums[mid] > target) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    private int f(String s) {
        int[] cnt = new int[26];
        char[] ch = s.toCharArray();
        for (char c : ch) {
            cnt[c - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (cnt[i] != 0) {
                return cnt[i];
            }
        }
        return 0;
    }
}
