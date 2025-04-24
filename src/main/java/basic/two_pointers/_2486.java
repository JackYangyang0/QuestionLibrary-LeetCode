package basic.two_pointers;

public class _2486 {

    public int appendCharacters(String s, String t) {
        int i = 0, j = 0;
        while (j < t.length()) {
            while (i < s.length() && s.charAt(i) != t.charAt(j)) {
                i++;
            }
            if (i == s.length()) {
                break;
            }
            i++;
            j++;
        }
        return t.length() - j;
    }
}
