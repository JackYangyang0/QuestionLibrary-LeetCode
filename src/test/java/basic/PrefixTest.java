package basic;

import basic.prefix._3361;
import org.junit.Test;

public class PrefixTest {

    @Test
    public void test() {
        _3361 q = new _3361();
        String s = "abab";
        String t = "baba";
        int[] n = new int[]{100,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int[] p = new int[]{1,100,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        q.shiftDistance2(s, t, n, p);
    }
}
