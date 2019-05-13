package arithmetic;

public class OneAppearTimes {
    public int oneAppearTimes(int n) {
        if (n < 1) {
            return 0;
        }
        int times = 0;
        String str = String.valueOf(n);
        if (str.length() == 1) {
            return str.equals("0") ? 0 : 1;
        }

        char ch = str.charAt(0);
        if (ch == '0') {
            oneAppearTimes(Integer.parseInt(str.substring(1)));
        } else if (ch == '1') {
            times += Integer.parseInt(str.substring(1)) + 1;
        } else {
            times += (int) Math.pow(10, str.length() - 1);
        }
        times += Integer.parseInt(String.valueOf(ch)) * (str.length() - 1) * Math.pow(10, str.length() - 2);
        return times + oneAppearTimes(Integer.parseInt(str.substring(1)));
    }
}
