package Arrays;

public class Solution 
{
    public int maxSubArray(int[] nums)
    {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++)
        {
            for (int j = i; j < nums.length; j++)
            {
                int sum = 0;
                for (int k = i; k <= j; k++) 
                {
                    sum += nums[k];
                } 
                if (sum > max) {
                    max = sum;
                }
            }
        }
     
        return max;
    }
    public static void main(String args[]){
        Solution s = new Solution();
        int[] nums = {-2,1,-3,4,-1,2,1,-2};
        System.out.println(s.maxSubArray(nums));
        
    }
}
