package huisu;

public class RobotMoveArea {

    public int getTotalNum(int[][] matrix, int k) {
        return move(matrix, k, 0, 0, 0);
    }

    public int move(int[][] matrix, int k, int num, int curI, int curJ) {
        if (curI < 0 || curI >= matrix.length ||
                curJ < 0 || curJ >= matrix[0].length) {
            return num;
        }
        if (matrix[curI][curJ] == 1) {
            return num;
        }
        if (!checkAccess(curI, curJ, k)) {
            return num;
        }
        num++;
        matrix[curI][curJ] = 1;
        num = move(matrix, k, num, curI + 1, curJ);
        num = move(matrix, k, num, curI - 1, curJ);
        num = move(matrix, k, num, curI, curJ + 1);
        num = move(matrix, k, num, curI, curJ - 1);
        return num;
    }

    private boolean checkAccess(int i, int j, int k) {
        String iStr = String.valueOf(i);
        String jStr = String.valueOf(j);
        int total = 0;
        for (int m = 0; m < iStr.length(); m++) {
            total += Integer.parseInt(String.valueOf(iStr.charAt(m)));
        }
        for (int m = 0; m < jStr.length(); m++) {
            total += Integer.parseInt(String.valueOf(jStr.charAt(m)));
        }
        return total <= k;
    }
}
