package arithmetic;

import java.util.LinkedList;

public class FindNumAppearOnce {
    public static int[] find(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            temp ^= array[i];
        }
        int index = findFirst1Index(temp);
        int[] v = new int[2];
        for (int i = 0; i < array.length; i++) {
            if (isBit1(array[i], index)) {
                v[0] ^= array[i];
            } else {
                v[1] ^= array[i];
            }
        }
        return v;
    }

    public static int findFirst1Index(int v) {
        int index = 0;
        while ((v & 1) != 1) {
            v >>= 1;
            index++;
        }
        return index;
    }

    public static boolean isBit1(int v, int index) {
        v >>= index;
        return (v & 1) == 1;
    }

    public static int findUniqueAppearNum(int[] array) {
        int[] bits = new int[32];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < 32; j++) {
                bits[j] += (array[i] >> j) & 1;
            }
        }
        int result = 0;
        for (int i = 0; i < 32; i++) {
            if (bits[i] % 3 != 0) {
                result += 1 << i;
            }
        }
        return result;
    }

}
