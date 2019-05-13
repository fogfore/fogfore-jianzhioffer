package arithmetic;

import org.junit.Test;

public class OneAppearTimesTest {
    @Test
    public void testOneAppearTimes() {
        OneAppearTimes oneAppearTimes = new OneAppearTimes();
        System.out.println(oneAppearTimes.oneAppearTimes(2025));
        System.out.println(oneAppearTimes.oneAppearTimes(25));
        System.out.println(oneAppearTimes.oneAppearTimes(12));

    }
}
