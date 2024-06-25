public class mergeArray2 {
    public static void merge(int arr1[], int arr2[]) {
        int n = arr1.length;
        int m = arr2.length;
        int i = n - m - 1;
        int j = m - 1;
        int k = n - 1;
        while (i >= 0 && j >= 0) {
            if (arr1[i] > arr2[j]) {
                arr1[k] = arr1[i];
                k--;
                i--;
            } else {
                arr1[k] = arr2[j];
                k--;
                j--;
            }
        }
        while (i > 0) {
            arr1[k--] = arr1[i--];
        }
        while (j > 0) {
            arr1[k--] = arr2[j--];
        }
        for (int l = 0; l < n; l++) {
            System.out.print(arr1[l] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {

        int arr1[] = new int[9];
        arr1[0] = 1;
        arr1[1] = 3;
        arr1[2] = 5;
        arr1[3] = 7;
        arr1[4] = 9;
        int arr2[] = { 2, 4, 6, 8 };
        merge(arr1, arr2);

    }
}