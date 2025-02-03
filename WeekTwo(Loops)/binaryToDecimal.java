
public class binaryToDecimal {
    public static void main(String[] args) {
        int n = 10101;

        int power = 1;
        int sum = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            sum = sum + lastDigit * power;

            power = power * 2;
            n = n / 10;
        }
        System.out.println(sum);
    }
}
