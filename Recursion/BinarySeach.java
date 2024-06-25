public class BinarySeach {
    public static int search(int arr[], int n, int key, int left, int right) {
        if (left > right) {
            return -1; // Element not found
        }
        int mid = (left + right) / 2;
        if (arr[mid] == key) {
            return mid;
        } else if (arr[mid] > key) {
            return search(arr, n, key, left, mid - 1);
        } else {
            return search(arr, n, key, mid + 1, right);
        }
    }

    public static void main(String args[]) {
        int arr[] = { 2, 12, 50, 10, 22, -5, 25 };
        int n = arr.length;
        int key = 2;
        int left = 0; // Corrected to 0
        int right = n - 1; // Corrected to n - 1
        int result = search(arr, n, key, left, right);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}
