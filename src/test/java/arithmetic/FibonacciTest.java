package arithmetic;

import org.junit.Test;

public class FibonacciTest {
    @Test
    public void testCal() {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.calc(8));
    }

    @Test
    public void test() {
        System.out.println(1 ^ 1);
    }
}
