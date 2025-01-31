public class evenOrOdd {
    public static boolean EvenOrOdd (int n)
    {
        if (
            n % 2 == 0
        )
        {
            return true;
        }
        else
        {
            return false;
        }
    }    
    public static void main(String[] args) {
        
        boolean result = EvenOrOdd(5);
        System.out.println(result);
    }
}

