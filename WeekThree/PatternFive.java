import java.util.Scanner;
public class PatternFive {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the number of rows: ");

        int row = in.nextInt();

        int space = 0;
        for (int i = 1; i <= row; i = i + 1)
        {
            for (int j = 1; j <= space; j = j + 1) 
            {
                System.out.print("  ");     
            }

            for (int j = 1; j <= row; j = j + 1)
            {
                System.out.print("*");     
            }

            space = space + 1;

            System.out.println();
        }


    }   
}
