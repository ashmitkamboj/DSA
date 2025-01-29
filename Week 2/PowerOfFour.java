public class PowerOfFour {
    public static void main(String[] args) {
        int n = 16;
        
        while(n > 1) {
            if(n % 4 == 0) {
                n = n / 4;
            }
            else {
                break;
            }
        }
        if (n == 1) {
            System.out.println("Power of four");
        }
        else {
            System.out.println("Not a power of four");
        }
    }
    
}
