public class missingNumber 
{
    public int MissingNumber (int[] nums)
    {
        int n = nums.length;
        int sum1 = (n*(n+1))/2;

        int sum2 = 0;
        for (int i = 0; i < n; i++) 
        {
            sum2 += nums[i];
        }

        int answer = sum1 - sum2;
        return answer;
    }
        
    public static void main(String[] args) 
    {
        missingNumber mn = new missingNumber();
        int[] nums = {3, 0, 1};
        System.out.println("Missing number is: " + mn.MissingNumber(nums));
    }
}
