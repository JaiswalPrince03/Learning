/**
 * asteroidCollision
 */
import java.lang.Math;
public class asteroidCollision {

    public static void main(String[] args) {
        int arr[] = {-90, 70, 60, 35, -65, 180, 70, -70, 60};
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j - 1] > 0 && arr[i] < 0) {
                    if (Math.abs(arr[j - 1]) < Math.abs(arr[i])) {
                        arr[j - 1] = 0;
                    } else if (Math.abs(arr[j - 1]) == Math.abs(arr[i])) {
                        arr[j - 1] = 0;
                        arr[i] = 0;
                        break;

                    } else {
                        arr[i] = 0;
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}