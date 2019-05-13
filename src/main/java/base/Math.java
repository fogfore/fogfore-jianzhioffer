package base;

public class Math {
    public double power(double base, int exp) {
        boolean isNegative = false;
        if (exp < 0) {
            if (base == 0) {
                throw new ArithmeticException("数据有误");
            }
            exp = -exp;
            isNegative = true;
        }
        double result = powerWithPositive(base, exp);
        result = isNegative ? 1 / result : result;
        return result;
    }

    private double powerWithPositive(double base, int exp) {
        assert exp >= 0;
        if (exp == 0) {
            return 1;
        }
        double result = powerWithPositive(base, exp >> 1);
        result *= result;
        if ((exp & 0x1) == 1) {
            result *= base;
        }
        return result;
    }
}
