public class one {
    public static void update(int a)
    
    // Pass by value(Orignial value of a is not changed)
    {
        a = a + 1;
        System.out.println("Updated function, a = " + a);  
    }

    // Pass by reference(Orignial value of arr is changed)
    public static void updateArray(int arr[]){
        arr[0] = 1;
        arr[1] = 2;
        System.out.println("Updated Array Function");
         for (int i = 0; i<5; i++)
        {
            System.out.println(arr[i] + " ");
        }
        System.out.println();        
    }
    public static void main(String[] args) {
        int a = 5;
        update(a);

        System.out.println("Main function, a = " + a);


        int arr [] = new int[5];
        arr[0] = 1;
        arr[1] = 2;

        updateArray(arr);
        System.out.println("Main function, arr = ");
        for (int i = 0; i<5; i++) {
            System.out.println(arr[i] + " ");   
        }

    }
    
}
