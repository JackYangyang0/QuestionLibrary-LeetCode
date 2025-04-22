package basic;

import basic.sliding_window._2090;
import basic.sliding_window._2730;
import basic.sliding_window._2904;
import org.junit.Assert;
import org.junit.Test;

public class SlidingWindowTest {
    _2090 sw1 = new _2090();
    @Test
    public void test_2090() {
        int[] nums = new int[]{7,4,3,9,1,8,5,2,6};
        int k = 3;
        Assert.assertArrayEquals(sw1.getAverages(nums, 3), new int[]{-1,-1,-1,5,4,4,-1,-1,-1});
    }

    @Test
    public void test_2730() {
        String s = "0001";
        _2730 t = new _2730();
        t.longestSemiRepetitiveSubstring(s);
    }

    @Test
    public void test_2904() {
        _2904 t = new _2904();
        String s = "1100100101011001001";
        int k = 7;
        t.shortestBeautifulSubstring(s, k);
    }

}
