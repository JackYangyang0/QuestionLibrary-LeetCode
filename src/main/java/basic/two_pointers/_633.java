package basic.two_pointers;

public class _633 {

    public boolean judgeSquareSum(int c) {
        long a = 0, b = (long)Math.sqrt(c);
        while (a <= b) {
            long d = a * a + b * b;
            if (d == c) {
                return true;
            } else if (d < c) {
                a++;
            } else {
                b--;
            }
        }
        return false;
    }
}
