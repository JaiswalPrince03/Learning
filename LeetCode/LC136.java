public class LC136 {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans = ans ^ nums[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        LC136 lc136 = new LC136();
        int[] nums = {2,2,1};
        System.out.println(lc136.singleNumber(nums));
    }
    
}
