import java.util.Scanner;
public class OnetoN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        System.out.println("Numbers from 1 to " + n + " are:");
        for(int i = 1; i <= n; i++) {
            System.out.println(i + " ");
        }
    }
}
