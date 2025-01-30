
import java.util.Scanner;
public class oddNo1ToN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        System.out.println("Odd numbers from 1 to " + n + " are:");
        for(int i = 1; i <= n; i=i+2) {
            System.out.println(i + " ");
        }
    }
}
