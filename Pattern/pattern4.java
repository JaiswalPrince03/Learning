// package Pattern;

public class pattern4 {
    public static void Print(int n) {

        int rows = 2 * n - 1;
        int col = 2 * n - 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= col; j++) {

                int dt = i - 1, db = rows - i, dl = j - 1, dr = col - j;
                int result = n - Math.min(Math.min(dr, dl), Math.min(dt, db));
                System.out.print(result);
                // if((i==1 || j==1)||(i==rows || j==col)){
                // System.out.print(n);
                // }
                // else if((i==2 || j==2)||(i==rows-1||j==col-1)){
                // System.out.print(n-1);

                // }
                // else if((i==3 || j==3)||(i==rows-2||j==col-2)){
                // System.out.print(n-2);

                // }
                // else{
                // System.out.print(n-3);
                // }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Print(8);

    }
}
