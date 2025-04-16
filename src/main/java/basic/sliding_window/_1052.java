package basic.sliding_window;

public class _1052 {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int max = 0;
        int[] s = new int[2]; // 用于分别记录心情好的总和与心情不好的总和

        for (int i = 0; i < customers.length; i++) {
            s[grumpy[i]] += customers[i];

            if (i < minutes - 1) {
                continue;
            }

            max = Math.max(max, s[1]);
            s[1] -= grumpy[i - minutes + 1] == 1 ? customers[i - minutes + 1] : 0;
        }
        return max + s[0];
    }
}
