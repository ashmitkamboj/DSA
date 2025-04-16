public class array {
    public static void main(String[] args) {
        int n = 10;
        int[] array = new int[n];
        int queries = 3;
        int[][] queryRanges = {
            {2, 5},
            {0, 3},
            {6, 9}
        };
        for (int q = 0; q < queries; q++) {
            int l = queryRanges[q][0];
            int r = queryRanges[q][1];
            for (int i = l; i <= r; i++) {
                array[i]++;
            }
        }
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
