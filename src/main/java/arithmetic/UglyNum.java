package arithmetic;

import com.fogfore.algorithm.utils.MathUtils;

public class UglyNum {
    public static int getNum(int index) {
        int[] uglyNums = new int[index];
        uglyNums[0] = 1;

        int i2 = 0;
        int i3 = 0;
        int i5 = 0;
        for (int nextUglyIndex = 1; nextUglyIndex < index; nextUglyIndex++) {
            int min = MathUtils.min(uglyNums[i2] * 2, uglyNums[i3] * 3, uglyNums[i5] * 5);
            uglyNums[nextUglyIndex] = min;
            while (uglyNums[i2] * 2 <= min) {
                i2++;
            }
            while (uglyNums[i3] * 3 <= min) {
                i3++;
            }
            while (uglyNums[i5] * 5 <= min) {
                i5++;
            }
        }
        return uglyNums[index - 1];
    }


}
