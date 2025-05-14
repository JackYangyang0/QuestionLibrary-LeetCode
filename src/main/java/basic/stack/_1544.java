package basic.stack;

public class _1544 {

    public String makeGood(String s) {
        StringBuilder str = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (!str.isEmpty() && (Character.isLowerCase(c) && str.charAt(str.length() - 1) == Character.toUpperCase(c) || Character.isUpperCase(c) && str.charAt(str.length() - 1) == Character.toLowerCase(c))) {
                str.deleteCharAt(str.length() - 1);
            } else {
                str.append(c);
            }
        }
        return str.toString();
    }
}
