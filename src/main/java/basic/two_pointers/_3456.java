package basic.two_pointers;

public class _3456 {

    public boolean hasSpecialSubstring(String s, int k) {
        int cnt = 0;
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            cnt++;

            if (i == ch.length - 1 || ch[i] != ch[i + 1]) {
                if (cnt == k) {
                    return true;
                }
                cnt = 0;
            }
        }
        return false;
    }
}
