package sort;

import java.util.Arrays;

public class QuickSortTwo {
    //快速排序
    public static void QuickSort(int[] a, int left, int right) {
        if (left < right) {
            int p = partition(a, left, right);
            System.out.println(p);
            QuickSort(a, left, p - 1);
            QuickSort(a, p + 1, right);
        }
    }

    //快速排序数组划分
    private static int partition(int[] a, int left, int right) {
        int x = a[right];
        int p = left - 1;
        for (int i = left; i < right; i++) {
            if (a[i] <= x) {
                p++;
                swap(a, p, i);
                System.out.println(Arrays.toString(a));
            }
        }
        swap(a, p+1, right);
        System.out.println(Arrays.toString(a));
        return p+1;
    }
    //交换数组a中的a[i]和a[j]
    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
