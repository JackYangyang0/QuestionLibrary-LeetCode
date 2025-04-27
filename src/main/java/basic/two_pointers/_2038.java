package basic.two_pointers;

public class _2038 {

    public boolean winnerOfGame(String colors) {
        char[] ch = colors.toCharArray();
        int n = ch.length;
        int i = 1, j = 1;
        while (i < n && j < n) {
            while (i + 1 < n && (ch[i] != 'A' || ch[i - 1] != 'A' || ch[i + 1] != 'A')) {
                i++;
            }

            if (i == n - 1) {
                return false;
            }

            while (j + 1 < n && (ch[j] != 'B' || ch[j - 1] != 'B' || ch[j + 1] != 'B')) {
                j++;
            }
            if (j == n - 1) {
                return true;
            }

            i++;
            j++;
        }
        return i != n;
    }
}
