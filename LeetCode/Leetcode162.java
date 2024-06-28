public class Leetcode162 {
    public static int findPeakElement(int[] nums) {
        int left = 0, right = nums.length - 1;
        int mid = (left + right) / 2;
        while (left < right) {
            System.out.println("left: " + left + ", right: " + right + ", mid: " + mid);
            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
            mid = (left + right) / 2;
        }
        return left;
    }

    public static void main(String args[]) {
        int[] nums = {1, 2, 3, 1};
        int index = findPeakElement(nums);
        System.out.println("index is " + index);
    }
}
