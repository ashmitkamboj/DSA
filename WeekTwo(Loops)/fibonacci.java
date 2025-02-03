
public class fibonacci {
    public static void main(String[] args) {
        int n = 10;
        int a = 0;
        int b = 1;
        System.out.println("First " + n + " terms of Fibonacci series are:");
        for(int i = 1; i <= n; i++) {
            System.out.println(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }  
}
