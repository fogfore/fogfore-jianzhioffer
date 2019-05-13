package huisu;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Path {

    public String has(char[][] matrix, String str) {
        int width = matrix[0].length;
        int height = matrix.length;
        int[][] visited = new int[height][width];
        int index = 0;
        LinkedList<Integer[]> result = new LinkedList<>();
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if (matrix[j][i] == str.charAt(0)) {
                    visited[j][i] = 1;
                    result.addLast(new Integer[]{j, i});
                    boolean success = next(matrix, visited, str, index+1, result, i, j);
                    if (success) {
                        StringBuilder resultStr = new StringBuilder();
                        while (!result.isEmpty()) {
                            resultStr.append(Arrays.toString(result.removeFirst()));
                        }
                        return resultStr.toString();
                    }
                    visited[j][i] = 0;
                    result.removeLast();
                }
            }
        }
        return null;
    }

    public boolean next(char[][] matrix, int[][] visited, String str, int index, LinkedList<Integer[]> list, int curX, int curY) {
        if (index >= str.length()) {
            return true;
        }
        int width = matrix[0].length;
        int height = matrix.length;
        int nextX, nextY;
        nextX = curX + 1;
        nextY = curY;
        boolean flag = false;
        if (nextX < width && visited[nextY][nextX] != 1 && matrix[nextY][nextX] == str.charAt(index)) {
            list.addLast(new Integer[]{nextY, nextX});
            visited[nextY][nextX] = 1;
            flag = next(matrix, visited, str, index + 1, list, nextX, nextY);
            if (flag) {
                return true;
            } else {
                list.removeLast();
                visited[nextY][nextX] = 0;
            }
        }
        nextX = curX - 1;
        nextY = curY;
        if (nextX >= 0 && visited[nextY][nextX] != 1 && matrix[nextY][nextX] == str.charAt(index)) {
            list.addLast(new Integer[]{nextY, nextX});
            visited[nextY][nextX] = 1;
            flag = next(matrix, visited, str, index + 1, list, nextX, nextY);
            if (flag) {
                return true;
            } else {
                list.removeLast();
                visited[nextY][nextX] = 0;
            }
        }
        nextX = curX;
        nextY = nextY + 1;
        if (nextY < height && visited[nextY][nextX] != 1 && matrix[nextY][nextX] == str.charAt(index)) {
            list.addLast(new Integer[]{nextY, nextX});
            visited[nextY][nextX] = 1;
            flag = next(matrix, visited, str, index + 1, list, nextX, nextY);
            if (flag) {
                return true;
            } else {
                list.removeLast();
                visited[nextY][nextX] = 0;
            }
        }
        nextX = curX;
        nextY = curY - 1;
        if (nextY >= 0 && visited[nextY][nextX] != 1 && matrix[nextY][nextX] == str.charAt(index)) {
            list.addLast(new Integer[]{nextY, nextX});
            visited[nextY][nextX] = 1;
            flag = next(matrix, visited, str, index + 1, list, nextX, nextY);
            if (flag) {
                return true;
            } else {
                list.removeLast();
                visited[nextY][nextX] = 0;
            }
        }
        return false;
    }
}
