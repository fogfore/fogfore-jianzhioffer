package arithmetic;

import org.junit.Test;

public class PrintMatrixClockwiseTest {
    @Test
    public void testPrint() {
        PrintMatrixClockwise printMatrixClockwise = new PrintMatrixClockwise();
        int[][] matrix = {
                {2, 5, 6, 7, 8, 9},
                {3, 8, 6, 2, 1, 0},
                {0, 5, 2, 3, 9, 4}
        };
        int[][] matrix1 = {
                {2, 5, 6, 7, 8, 9},
                {3, 8, 6, 2, 1, 0},
                {0, 5, 2, 3, 9, 4},
                {3, 5, 6, 1, 3, 1}
        };
        int[][] matrix2 = {
                {2, 5, 6, 7},
                {3, 8, 6, 2},
                {0, 5, 2, 3},
                {0, 3, 6, 9},
                {2, 6, 7, 9}
        };
        int[][] matrix4 = {
                {2, 5, 6},
                {3, 8, 6},
                {0, 5, 2},
                {0, 3, 6},
                {2, 6, 7}
        };
        int[][] matrix3 = {
                {2}
        };
        printMatrixClockwise.print(matrix);
        printMatrixClockwise.print(matrix1);
        printMatrixClockwise.print(matrix2);
        printMatrixClockwise.print(matrix3);
        printMatrixClockwise.print(matrix4);
    }
}
