import java.util.Scanner;

public class Traverse_array {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

    //     for (int i = 0; i < array.length; i++) {
    //         System.out.println("Element at index " + i + ": " + array[i]);
    //     }
    // }

System.out.println("Enter the position where you want to insert an element (0 to " + array.length + "): ");
Scanner scanner = new Scanner(System.in);
int position = scanner.nextInt();

if (position < 0 || position > array.length) {
    System.out.println("Invalid position!");
} else {
    System.out.println("Enter the value to insert: ");
    int value = scanner.nextInt();

    int[] newArray = new int[array.length + 1];
    for (int i = 0, j = 0; i < newArray.length; i++) {
        if (i == position) {
            newArray[i] = value;
        } else {
            newArray[i] = array[j++];
        }
    }

    System.out.println("Array after insertion:");
    for (int i = 0; i < newArray.length; i++) {
        System.out.println("Element at index " + i + ": " + newArray[i]);
    }
}
scanner.close();
    }
}