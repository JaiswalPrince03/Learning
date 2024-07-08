// package CodeForce;

import java.util.Scanner;

public class ChossingLaptop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int[][] arr = new int[n][4];
 
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt(); 
            arr[i][1] = sc.nextInt(); 
            arr[i][2] = sc.nextInt(); 
            arr[i][3] = sc.nextInt(); 
        }
 
 
        boolean[] bool = new boolean[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1] && arr[i][2] < arr[j][2]) {
                    bool[i] = true;
                    break;
                }
            }
        }
 
        int min = Integer.MAX_VALUE;
        int ans = -1;
        for (int i = 0; i < n; i++) {
            if (!bool[i] && arr[i][3] < min) {
                min = arr[i][3];
                ans = i + 1; 
            }
        }
 
        System.out.println(ans);
 
        sc.close();
    }
    
}
