package basic.two_pointers;

public class _392 {

    public boolean isSubsequence(String s, String t) {
        int l = 0, r = 0;
        while (l < s.length()) {
            while (r <t.length() && s.charAt(l) != t.charAt(r)) {
                r++;
            }
            if (r == t.length()) {
                return false;
            }
            l++;
            r++;
        }
        return true;
    }
}
