package arithmetic;

import org.apache.commons.lang3.ObjectUtils;

public class MaxValue {
    public int getMaxValue(int[][] matrix) {
        int colNum = matrix[0].length;
        int rowNum = matrix.length;
        int[] cache = new int[colNum];
        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < colNum; j++) {
                int up = 0;
                int left = 0;
                if (i > 0) {
                    up = cache[j];
                }
                if (j > 0) {
                    left = cache[j - 1];
                }
                cache[j] = Math.max(up, left) + matrix[i][j];
            }
        }
        return cache[colNum - 1];
    }
}
