package basic;

import basic.stack._1003;
import basic.stack._2211;
import basic.stack._3412;
import basic.stack._844;
import org.junit.Test;

public class StackTest {

    @Test
    public void test1() {
        String s = "xywrrmp";
        String t = "xywrrmu#p";
        _844 q = new _844();
        q.backspaceCompare(s, t);
    }

    @Test
    public void test2() {
        String s = "eockppxdqclkhjgvnw";
        _3412 q = new _3412();
        q.calculateScore(s);
    }

    @Test
    public void test3() {
        String s = "aabcbc";
        _1003 q = new _1003();
        q.isValid(s);
    }

    @Test
    public void test4() {
        String s = "RLRSLL";
        _2211 q = new _2211();
        q.countCollisions(s);
    }
}
