package arithmetic;

public class DigitNum {
    public static int find(int[] array, int target) {
        int[] indexes = {-1, -1};
        findFirstAndEndIndex(array, target, 0, array.length - 1, indexes);
        if (indexes[0] == -1 || indexes[1] == -1) {
            return -1;
        } else {
            return indexes[1] - indexes[0] + 1;
        }
    }

    private static void findFirstAndEndIndex(int[] array, int target, int low, int high, int[] indexes) {
        if (low > high) {
            return;
        }
        int mid = (low + high) >> 1;
        if (array[mid] > target) {
            findFirstAndEndIndex(array, target, low, mid - 1, indexes);
        } else if (array[mid] < target) {
            findFirstAndEndIndex(array, target, mid + 1, high, indexes);
        } else {
            if (indexes[0] == -1) {
                if (mid == 0 || array[mid - 1] < target) {
                    indexes[0] = mid;
                } else {
                    findFirstAndEndIndex(array, target, low, mid - 1, indexes);
                }
            }
            if (indexes[1] == -1) {
                if (mid == array.length - 1 || array[mid + 1] > target) {
                    indexes[1] = mid;
                } else {
                    findFirstAndEndIndex(array, target, mid + 1, high, indexes);
                }
            }
        }
    }
}
