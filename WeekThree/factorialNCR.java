import java.util.Scanner;
public class factorialNCR {

    public static long factorial(int n)
    {
        long factorial = 1;

        for (int i = 1; i <= n; i++) 
        {
            factorial = factorial * i;    
        }
        
        return factorial;
    }

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
    
        int n = in.nextInt();
        int r = in.nextInt();
    
        long n_factorial = factorial(n);
        long r_factorial = factorial(r);
        long nR_factorial = factorial(n - r);

        long answer = n_factorial / r_factorial;
        answer = answer / nR_factorial;

        System.out.println(answer);

    }
}
