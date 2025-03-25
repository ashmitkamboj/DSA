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
















//Java Program for Merge Sort
class MergeSort {
    public static void display(int[] arr, int size)
    {
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        int[] a = {12, 8, 4, 14, 36, 64, 15, 72, 67, 84};

        int size = a.length;
        display(a, size);

        mergeSort(a, 0, size - 1);
        display(a, size);
    }

   
    static void mergeSort(int[] a, int left, int right)
    {
        int mid;
        if(left < right)
        {
            mid = (left + right) / 2;

            // recursive calls to sort first half and second half sub-arrays
            mergeSort(a, left, mid);
            mergeSort(a, mid + 1, right);
            merge(a, left, mid, right);
        }
    }
    // after sorting this function merge the array
    static void merge(int[] arr, int left, int mid, int right)
    {
        int i, j, k;
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // create temp arrays to store left and right sub-arrays
        int L[] = new int[n1];
        int R[] = new int[n2];

        // Copying data to temp arrays L[] and R[]
        for (i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        // here we merge the temp arrays back into arr[l..r]
        i = 0; // Starting index of L[i]
        j = 0; // Starting index of R[i]
        k = left; // Starting index of merged sub-array

        while (i < n1 && j < n2)
        {
            // place the smaller item at arr[k] pos
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
  
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}