public class LC33 {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target)
                return mid;
            if (nums[mid] <= nums[right]) {
                if (nums[mid] <= target  && target <= nums[right])
                    left = mid + 1;
                else
                    right = mid - 1;
            } else {
                if (target <= nums[mid] && target >= nums[left])
                    right = mid - 1;
                else
                    left = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        LC33 lc33 = new LC33();
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println(lc33.search(nums, 3));


    }

}

