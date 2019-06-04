package arithmetic;

public class MaxStrLen {
    public int get(String str) {
        int[] position = new int[26];
        for (int i = 0; i < position.length; i++) {
            position[i] = 1;
        }
        int curLen = 0;
        int maxLen = 0;
        for (int i = 0; i < str.length(); i++) {
            int preIndex = position[str.charAt(i) - 'a'];
            if (preIndex < 0 || i - preIndex > curLen) {
                curLen++;
            } else {
                curLen = i - preIndex;
            }
            maxLen = curLen > maxLen ? curLen : maxLen;
            position[str.charAt(i) - 'a'] = i;
        }
        return maxLen;
    }
}
