package basic.two_pointers;

public class _1957 {

    public String makeFancyString(String s) {
        StringBuilder str = new StringBuilder();
        char[] ch = s.toCharArray();
        str.append(ch[0]);
        int cnt = 1;
        for (int i = 1; i < ch.length; i++) {
            if (ch[i] == ch[i - 1]) {
                cnt++;
            } else {
                cnt = 1;
            }

            if (cnt >= 3) {
                continue;
            }
            str.append(ch[i]);
        }
        return str.toString();
    }
}
