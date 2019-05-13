package search;

import org.junit.Test;

public class RotationSortTest {
    @Test
    public void testFindMin() {
        RotationSort rotationSort = new RotationSort();
        int[] array = {5, 8, 9, 10, 2, 3, 4};
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(rotationSort.findMin(array));
        System.out.println(rotationSort.findMin(array1));
    }
}
