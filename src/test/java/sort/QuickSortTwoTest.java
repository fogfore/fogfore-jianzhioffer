package sort;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

public class QuickSortTwoTest {
    private static Random random = new Random(System.currentTimeMillis());
    @Test
    public void testQuickSort() {
        int len = 25;
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = random.nextInt(len);
        }
        System.out.println(Arrays.toString(array));
        QuickSortTwo.QuickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }
}
