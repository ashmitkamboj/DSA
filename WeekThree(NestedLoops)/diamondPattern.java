public class diamondPattern {
    public static void main(String[] args) {
        int n = 7;

        int space = n - 1;
        int star = 1;

        for (int i = 1; i <= (n/2) + 1; i++) 
        {
            for (int j = 1; j <= space; j++) 
            {
                System.out.print(" ");    
            }    

            for (int j = 1; j <= star; j++) 
            {
                System.out.print("* ");    
            }

            space = space - 2;
            star =  star + 2;

            System.out.println();
        }

        space = 2;
        star = n - 2;

        for (int i = 1; i <= (n/2); i++) 
        {
            for (int j = 1; j <= space; j++) 
            {
                System.out.print(" ");    
            }    

            for (int j = 1; j <= star; j++) 
            {
                System.out.print("* ");    
            }

            space = space + 2;
            star =  star - 2;

            System.out.println();
        }
    }
}
