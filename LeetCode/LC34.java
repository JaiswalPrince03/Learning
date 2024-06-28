public class LC34 {
    public int[] searchRange(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int mid = (left + right) / 2;
        while (left <= right) {
            
            if (nums[mid] == target) {
                int left1 = mid, right1 = mid;
                while (left1 > 0 && nums[left1 - 1] == target) {
                    left1--;
                }
                while (right1 < nums.length - 1 && nums[right1 + 1] == target) {
                    right1++;
                }
                System.out.println("Found target range: [" + left1 + ", " + right1 + "]");
                return new int[]{left1, right1};
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
            mid = (left + right) / 2;
        }
        System.out.println("Target not found");
        return new int[]{-1, -1};
    }
    
    // Time complexity explanation:
    // The binary search part of the algorithm runs in O(log n) time, where n is the number of elements in the array.
    // Once the target is found, the algorithm performs a linear scan to the left and right to find the range,
    // which in the worst case can take O(n) time. Therefore, the overall time complexity is O(n).
}

