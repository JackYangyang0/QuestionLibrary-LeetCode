package basic.two_pointers;

public class _2825 {

    public boolean canMakeSubsequence(String str1, String str2) {
        int i = 0, j = 0;
        while (j < str2.length()) {
            while (i < str1.length() && str1.charAt(i) != str2.charAt(j)) {
                if ((char)('a' + (str1.charAt(i) + 1 - 'a') % 26) == str2.charAt(j)) {
                    break;
                }
                i++;
            }
            if (i == str1.length()) {
                return false;
            }
            i++;
            j++;
        }
        return true;
    }
}
