package sort;

import org.junit.Test;

import java.util.Arrays;

public class QuickSortTest {
    @Test
    public void testSort() {
        QuickSort quickSort = new QuickSort();
        int[] a = {2, 7, 8, 6, 15, 19, 9, 5, 6, 2, 8, 4, 36, 25};
        quickSort.sort(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));
    }
}
