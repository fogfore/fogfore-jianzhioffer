package huisu;

import org.junit.Test;

public class PathTest {
    @Test
    public void testHas() {
        final char[][] chars = {
                {'a', 'b', 't', 'g'},
                {'c', 'f', 'c', 's'},
                {'j', 'd', 'e', 'h'}
        };
        Path path = new Path();
        String string = path.has(chars, "bfce");
        System.out.println(string);

    }
}
