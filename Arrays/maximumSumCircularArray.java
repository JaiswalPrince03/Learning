package Arrays;

public class maximumSumCircularArray {
    public static void main(String[] args) {
        int[] nums = {11,2,-5,2,-7,-17,15,9,12,-15,-5,-15,17};
        System.out.println(maximumSumCircular(nums));
    }

    public static int maximumSumCircular(int[] nums) {
        int n = nums.length;
        int maxSum = nums[0];
        int minSum = nums[0];
        int totalSum = nums[0];
        int maxCurr = nums[0];
        int minCurr = nums[0];

        for (int i = 1; i < n; i++) {
            maxCurr = Math.max(nums[i], maxCurr + nums[i]);
            maxSum = Math.max(maxSum, maxCurr);
            minCurr = Math.min(nums[i], minCurr + nums[i]);
            minSum = Math.min(minSum, minCurr);
            totalSum += nums[i];
        }

        if (maxSum > 0) {
            return Math.max(maxSum, totalSum - minSum);
        } else {
            return maxSum;
        }
    }
}
