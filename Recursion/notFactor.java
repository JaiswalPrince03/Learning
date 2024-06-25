public class notFactor {
    public static int Largest(int[] arr, int n, int max, int index) {
        if (index == n) {
            return max;
        }
        if ((arr[index] % 3 == 0) && (arr[index]%5!=0)){
            if (arr[index] > max) {
                max = arr[index];
            }
        }
        return Largest(arr, n, max, index + 1);
    }

    public static void main(String[] args) {
        int arr[] = {360, 60, 90, 120};
        int index = 0;
        int n = arr.length;
        int result = Largest(arr, n, 0, index);
        System.out.println(result);
    }
}
