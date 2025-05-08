package basic.prefix;

public class _2559 {

    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = queries.length;
        int[] ans = new int[n];
        int[] prefix = new int[words.length + 1];
        for (int i = 0; i < words.length; i++) {
            prefix[i + 1] = prefix[i] + (check(words[i]) ? 1 : 0);
        }

        for (int i = 0; i < n; i++) {
            int[] query = queries[i];
            int l = query[0], r = query[1];
            ans[i] = prefix[r + 1] - prefix[l];
        }
        return ans;
    }

    private boolean check(String s) {
        char start = s.charAt(0), end = s.charAt(s.length() - 1);
        if (start == 'a' || start == 'e' || start == 'i' || start == 'o' || start == 'u') {
            return end == 'a' || end == 'e' || end == 'i' || end == 'o' || end == 'u';
        }
        return false;
    }
}
