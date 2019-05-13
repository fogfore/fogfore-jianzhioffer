package sort;

public class QuickSort {
    public void sort(int[] array,int low, int high) {
        if (low < high) {
            int mid = partition(array, low, high);
            sort(array, low, mid - 1);
            sort(array, mid + 1, high);
        }
    }

    public int partition(int[] array, int low, int high) {
        int temp = array[low];
        while (low < high) {
            while (low < high && array[high] >= temp) {
                high--;
            }
            array[low] = array[high];
            while (low < high && array[low] <= temp) {
                low++;
            }
            array[high] = array[low];
        }
        array[low] = temp;
        return low;
    }

}
