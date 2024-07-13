
public class LC268 {
    public static int missingNumber(int[] nums) {
        int n = nums.length + 1; // Corrected to use the length of the array plus one as 'n'
        int result = n * (n + 1) / 2; // Corrected to use 'n' correctly
        for(int i = 0; i < nums.length; i++){
            result -= nums[i]; // Corrected to subtract each number in the array from 'result'
        }
        return result; // Corrected to return the final 'result'
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,5};
        System.out.println(missingNumber(nums));
    }
}
