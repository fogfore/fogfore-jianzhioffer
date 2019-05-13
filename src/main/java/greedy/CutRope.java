package greedy;

public class CutRope {
    public int cut(int n) {
        if (n < 2) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        if (n == 3) {
            return 2;
        }
        int numOf3 = n / 3;
        if (n % 3 == 1) {
            numOf3--;
        }
        int numOf2 = (n - numOf3 * 3) / 2;
        return (int) (Math.pow(3, numOf3) * Math.pow(2, numOf2));
    }
}
