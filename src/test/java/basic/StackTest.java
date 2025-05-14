package basic;

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
}
