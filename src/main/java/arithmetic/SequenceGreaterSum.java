package arithmetic;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class SequenceGreaterSum {
    public int getSequenceGreaterSum(int[] array) {
        if (ArrayUtils.isEmpty(array)) {
            throw new NullPointerException("输入为空");
        }

        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int v : array) {
            sum += v;
            maxSum = sum > maxSum ? sum : maxSum;
            sum = sum < 0 ? 0 : sum;
        }

        return maxSum;
    }
}
