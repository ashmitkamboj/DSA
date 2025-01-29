public class GCD {
    public static void main(String[] args) {
        int a = 52;
        int b = 426;

        int minimum = 0;
        
        if (a < b) 
        {
            minimum = a;
        }
        else
        {
            minimum = b;
        }
        int answer = 0;
        for (int i = 1; i <= minimum; i++) {
            if (a % i == 0 && b % i == 0) {
                answer = i;
            }
        }
        System.out.println(answer);
    }
}
