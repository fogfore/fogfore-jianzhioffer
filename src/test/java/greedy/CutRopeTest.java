package greedy;

import org.junit.Test;

public class CutRopeTest {
    @Test
    public void testCut() {
        CutRope cutRope = new CutRope();
        int cut = cutRope.cut(8);
        System.out.println(cut);

    }

    @Test
    public void test() {
        int a = 0xFFFFFFFE;
        int b = 0x00000001;
        System.out.println(Integer.MIN_VALUE);
        System.out.println(a);
        System.out.println(b);
        System.out.println(a - b);
        System.out.printf("%x\n", (a-b));
    }
}
