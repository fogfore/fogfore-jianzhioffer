package arithmetic;

public class ReverseOrder {
    public static int merge(int[] source, int[] temp, int low, int high) {
        if (low >= high) {
            return 0;
        }
        int mid = (low + high) / 2;
        int count = 0;
        count += merge(source, temp, low, mid);
        count += merge(source, temp, mid + 1, high);

        int i1 = mid;
        int i2 = high;
        int i3 = high;

        while (i1 >= low || i2 > mid) {
            if (i1 >= low && i2 > mid && source[i1] > source[i2]) {
                count += i2 - mid;
                temp[i3] = source[i1];
                i3--;
                i1--;
            } else if (i1 >= low && i2 > mid && source[i1] <= source[i2]) {
                temp[i3] = source[i2];
                i3--;
                i2--;
            } else if (i1 >= low && i2 <= mid) {
                for (; i1 >= low; i1--) {
                    temp[i3] = source[i1];
                    i3--;
                }
            } else if (i1 < low && i2 > mid) {
                for (; i2 > mid; i2--) {
                    temp[i3] = source[i2];
                    i3--;
                }
            }
        }
        if (high + 1 - low >= 0) System.arraycopy(temp, low, source, low, high + 1 - low);
        return count;
    }
}
