package arithmetic;

import org.junit.Test;

public class SequenceGreaterSumTest {
    @Test
    public void testGetSequenceGreaterSum() {
        int[] array = {-1, -2, -3, -10, -4, -7, -2, -5};
        SequenceGreaterSum sequenceGreaterSum = new SequenceGreaterSum();
        int sum = sequenceGreaterSum.getSequenceGreaterSum(array);
        System.out.println(sum);
    }
}
