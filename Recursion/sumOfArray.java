

public class sumOfArray {
    public static int Sum(int[] arr, int leng, int index) {
        if (index == leng) {
            return 0;
        } else {
            return (arr[index] + Sum(arr, leng, index + 1));
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int leng = arr.length;

        int result = Sum(arr, leng, 0);
        System.out.println("Sum of array: " + result);

    }

}
