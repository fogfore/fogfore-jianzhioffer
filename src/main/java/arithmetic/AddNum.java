package arithmetic;

public class AddNum {
    public static int add(int a, int b) {

        int sum = a ^ b;
        int carry = (a & b) << 1;
        if (carry == 0) {
            return sum;
        } else {
            return add(sum, carry);
        }
    }

    public static void main(String[] args) {
        int sum = AddNum.add(-6, 5);
        System.out.println(sum);
    }
}
