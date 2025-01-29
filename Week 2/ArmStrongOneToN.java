public class ArmStrongOneToN {
    public static void main(String[] args) {
        int n = 1000;
        for (int i = 1; i <= n; i++)
        {
             int sum = 0;
             int temp = i;

             while (temp > 0)
            {
                int lastDigit = temp % 10;
                sum = sum + lastDigit * lastDigit * lastDigit;
                temp = temp / 10;
            }

            if (sum == i) 
            {
                System.out.println(i);
            }
        }
    }
}
