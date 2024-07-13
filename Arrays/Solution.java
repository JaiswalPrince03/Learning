public class Solution 
{
    public int maxSubArray(int[] nums)
    {
        int max = Integer.MIN_VALUE;
        int currentMax = 0;
        for (int i = 0; i < nums.length; i++)
        {
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            max = Math.max(max, currentMax);
        }
        return max;
    }
    public static void main(String args[]){
        Solution s = new Solution();
        int[] nums = {-2,1,-3,4,-1,2,1,-2};
        System.out.println(s.maxSubArray(nums));
        
    }
}
