import java.util.Scanner;
public class alphabetOrDigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = in.next().charAt(0);
        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("Alphabet");
        } else if(ch >= '0' && ch <= '9') {
            System.out.println("Digit");
        } else {
            System.out.println("Special character");
        }
    }
}
