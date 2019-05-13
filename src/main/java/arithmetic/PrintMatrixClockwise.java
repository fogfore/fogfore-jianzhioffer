package arithmetic;

import com.alibaba.druid.support.spring.stat.annotation.Stat;

public class PrintMatrixClockwise {
    public void print(int[][] matrix) {
        if (matrix == null) {
            return;
        }
        int colNum = matrix[0].length;
        int rowNum = matrix.length;
        int start = 0;
        while (colNum > 2 * start && rowNum > 2 * start) {
            printCircle(matrix, start);
            start++;
        }
        System.out.println();
    }

    private void printCircle(int[][] matrix, int start) {
        int colNum = matrix[0].length;
        int rowNum = matrix.length;
        int endX = colNum - start - 1;
        int endY = rowNum - start - 1;
        for (int i = start; i <= endX; i++) {
            System.out.print(matrix[start][i] + " ");
        }
        for (int i = start + 1; i <= endY; i++) {
            System.out.print(matrix[i][endX] + " ");
        }
        if (start != endY) {
            for (int i = endX - 1; i >= start; i--) {
                System.out.print(matrix[endY][i] + " ");
            }
        }
        if (start != endX) {
            for (int i = endY - 1; i > start; i--) {
                System.out.print(matrix[i][start] + " ");
            }
        }
    }
}
