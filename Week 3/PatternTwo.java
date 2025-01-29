import java.util.Scanner;
public class PatternTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");

        int row = in.nextInt();

        for (int i = 1; i <= row; i = i + 1) {
            for (int j = 1; j <= i; j = j + 1) 
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
