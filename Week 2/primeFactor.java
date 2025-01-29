public class primeFactor {
    public static void main(String[] args) {
        int n = 325;
        System.out.println("Prime factors of " + n + " are:");
        for(int i = 2; i <= n; i++) {
            while(n % i == 0) {
                System.out.println(i + " ");
                n = n / i;
            }
        }
    }
}
