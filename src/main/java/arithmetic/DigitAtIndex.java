package arithmetic;

/**
 * 189
 */
public class DigitAtIndex {
    public int digitAtIndex(int index) {
        if (index < 0) {
            return -1;
        }
        int digits = 1;
        int count = 0;
        while (true) {
            count = countOfIntegers(digits);
            if (index < count * digits) {
                return digitAtIndex(index, digits);
            }
            index -= count * digits;
            digits++;
        }
    }

    private int digitAtIndex(int index, int digits) {
        int number = beginNumber(digits) + index / digits;
        int indexFromRight = digits - index % digits;
        for (int i = 1; i < indexFromRight; i++) {
            number /= 10;
        }
        return number % 10;
    }

    private int beginNumber(int digits) {
        if (digits == 1) {
            return 0;
        }
        return (int) Math.pow(10, digits - 1);
    }

    private int countOfIntegers(int digits) {
        if (digits == 1) {
            return 10;
        }
        return 9 * (int) Math.pow(10, digits - 1);
    }
}
