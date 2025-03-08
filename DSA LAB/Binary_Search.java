// public class Binary_Search {
//     public static String binarySearch (int low, int high, int target) {
//         while (low <= high) {
//             int mid = low + (high - low) / 2;
//             System.out.println("Checking mid value at " + mid);
//             if (mid == target) {
//                 return "Taregt " + target + " found at index " + mid;
//             } else if (mid < target) {
//                 low = mid + 1;
//             } else {
//                 high = mid - 1;
//             }
//         }
//         return "Not found";
//     }
//     public static void main(String[] args) {
//         int target = 42;
//         String result = binarySearch(1, 100, target);
//         System.out.println(result);
//     }
// }

public class Binary_Search {
    static int binary_Search(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high){
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (key > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {1, 2, 4, 10, 42, 70, 100, 130, 200, 500};
        int key = 100;
        System.out.println("Key found at index: " + binary_Search(arr, key));
    }
}