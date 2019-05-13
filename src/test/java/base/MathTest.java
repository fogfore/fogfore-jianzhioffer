package base;

import org.junit.Test;

public class MathTest {
    @Test
    public void testPower() {
        Math math = new Math();
        System.out.println(math.power(2, -10));
    }
}
