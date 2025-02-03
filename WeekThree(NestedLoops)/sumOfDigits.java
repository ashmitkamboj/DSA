import java.util.Scanner; 
public class sumOfDigits {
    public static int Sum(int n)
    {
        int sum = 0;
        while (n > 0)
         {
            int lastDigit = n % 10;
            sum = sum  + lastDigit;;
            n = n / 10;
         }

        return sum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();

        System.out.println(Sum(n));
    }
}
