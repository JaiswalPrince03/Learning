public class indexReturn {
    public static int Mini(int[] arr, int leng, int min, int index) {
        if (index == leng) {
            return min;
        } else {
            if (arr[index] < arr[min]) {
                min = index;
            }
            return Mini(arr, leng, min, index + 1);
        }
    }
  

    public static void main(String[] args) {
        int[] arr = { 0, 3, 10, 7};
        int leng = arr.length;
        int min = 0;
        int result = Mini(arr, leng, min, 0);
        System.out.println(" " + result);
    }
}