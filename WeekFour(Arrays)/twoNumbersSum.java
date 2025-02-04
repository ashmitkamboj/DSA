public class twoNumbersSum {
    public int [] twoSum(int[] numbers, int target) {
        int [] result = new int[2];
        result[0] = -1;
        result[1] = -1;


        int n = numbers.length;

        int i = 0;
        int j = n - 1;

        while (i < j) {
            int currentSum = numbers[i] + numbers[j];
            if(currentSum == target) 
            {

                result[0] = i + 1;
                result[1] = j + 1;

                break;
            }

            else if (currentSum > target) {
                j--;
            }
            else{
                i++;
            }
            }
            return result;
        }    
        
    public static void main(String[] args) {
        int [] numbers = {2,7,11,15};
        int target = 9;
        twoNumbersSum obj = new twoNumbersSum();
        int [] result = obj.twoSum(numbers, target);
        System.out.println(result[0] + " " + result[1]);
    }
}
