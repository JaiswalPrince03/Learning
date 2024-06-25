public class BubbleSort {
    public static void Sort(int arr[], int len, int i, int j) {

        if (i >= len - 1) {
            return;
        } else {
            if (j < len - 1 - i) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                Sort(arr, len, i, j + 1);
            }
            Sort(arr, len, i + 1, 0);

        }
    }

    public static void main(String[] args) {
        int arr[] = { 20,1,-20,7,5,17,70 };
        int len = arr.length;
        Sort(arr, len, 0, 0);
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
