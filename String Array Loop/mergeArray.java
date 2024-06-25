public class mergeArray {

    public static void main(String args[]) {
        int arr1[] = { 1, 3, 5, 7, 9 };
        int arr2[] = { 2, 4, 6, 8 };
        int arr3[] = {};
        int i, j, k;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                arr3[k++] = arr1[i++];
            } else {
                arr3[k++] = arr2[j++];
            }
        }
        while (i < arr1.length) {
            arr3[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            arr3[k++] = arr2[j++];
        }
        for (i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }

    }

}
