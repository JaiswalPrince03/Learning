import java.util.*;
public class LC268 {
    public static int missingNumber(int[] nums) {
        
        int result=n*(n+1)/2;
        System.out.println(result);
        
        for(int i=0;i<nums.length;i++){
            result -=nums[i];
            
            }
            return result;
        

        
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,5};
        System.out.println(missingNumber(nums));
    }
}
