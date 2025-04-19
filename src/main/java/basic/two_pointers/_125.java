package basic.two_pointers;

public class _125 {

    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c) || Character.isLowerCase(c)) {
                str.append(c);
            } else if (Character.isUpperCase(c)) {
                str.append((char)(c - 'A' + 'a'));
            }
        }
        s = str.toString();
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
