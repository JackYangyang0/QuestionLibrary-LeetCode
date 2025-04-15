package basic;

import basic.sliding_window._2090;
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

}
