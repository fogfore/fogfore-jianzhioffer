package arithmetic;

public class Fibonacci {
    public int calc(int n) {
        int cacheOne = 0;
        int cacheTwo = 1;
        int cacheCur = 0;
        if (n < 2) {
            cacheCur = n;
        }
        for (int i = 2; i <= n; i++) {
            cacheCur = cacheOne + cacheTwo;
            cacheOne = cacheTwo;
            cacheTwo = cacheCur;
        }
        return cacheCur;
    }
}
