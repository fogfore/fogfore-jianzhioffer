package search;

public class RotationSort {
    public int findMin(int[] array) {
        int low = 0;
        int high = array.length - 1;
        int oneDatum = array[0];
        int twoDatum = array[high];
        int mid = 0;
        while (low < high) {
            mid = (low + high) / 2;
            if (array[mid] == oneDatum && array[mid] == twoDatum) {
                return findBySeq(array);
            }
            if (array[mid] >= oneDatum) {
                low = mid + 1;
            }
            if (array[mid] <= twoDatum) {
                high = mid;
            }
        }
        return array[low] < oneDatum ? array[low] : array[0];
    }

    public int findBySeq(int[] array) {
        if (null == array) {
            return -1;
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
