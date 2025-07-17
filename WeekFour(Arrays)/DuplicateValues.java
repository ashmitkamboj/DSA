import java.util.Scanner;
public class DuplicateValues {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n ; i++)
        {
            arr[i] = in.nextInt();
        }

        int maxiNumber  = 0;
        for (int i = 0; i < n; i++) 
        {
            maxiNumber = Math.max(maxiNumber, arr[i]);
        }  

        int fre[] = new int[maxiNumber + 1];


        for (int i = 0; i < n ; i++) 
        {
            fre[arr[i]]++;
        }

        int count = 0;
        for(int i = 0; i < n; i++) 
        {
            if (fre[i] > 2)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
