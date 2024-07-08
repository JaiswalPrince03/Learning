// package CodeForce;

import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[][] matrix = new int[5][5];
        int row = 0, col = 0;
        
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                matrix[i][j] = sc.nextInt();
                // System.out.println(matrix[i][j]);
                if(matrix[i][j] == 1){
                    row = i;
                    col = j;
                    break;
                }
            }
            if(row != 0) break; // Exit the outer loop as well if 1 is found
        }
        System.out.println(Math.abs(2 - row) + Math.abs(2 - col));
    }
}
