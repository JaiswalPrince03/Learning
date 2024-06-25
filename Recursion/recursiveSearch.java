/**
 * recursiveSearch
 */
public class recursiveSearch {
    public static int recursive(int[] arr, int target, int n, int index) {
        if (index == n) {
            return -1;
        } else if (arr[index] == target) {
            return index;
        } else {
            return recursive(arr, target, n, index + 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int target = 8;
        int n = arr.length;
        int result = recursive(arr, target, n, 0);
        if (result == -1) {
            System.out.println("Target not found.");
        } else {
            System.out.println("Target found at index: " + result);
        }
    }
}
