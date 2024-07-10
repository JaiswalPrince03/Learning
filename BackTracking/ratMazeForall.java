// package BackTracking;

public class ratMazeForall {
    public static void rIAM(int matrix[][], int r, int c, int n, int m, int path[][]) {
        // base case
        if (r == n - 1 && c == m - 1) {
            path[r][c] = 1;
            System.out.println("Path found:");
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    System.out.print(path[i][j]+" ");
                }
                System.out.println();
            }
            return;
        }
        // recursive case
        // right move
        path[r][c] = 1;
        if (c + 1 < m && matrix[r][c + 1] == 0) {
            rIAM(matrix, r, c + 1, n, m, path);
            // return;
        }
        // down move
        if (r + 1 < n && matrix[r + 1][c] == 0) {
            rIAM(matrix, r + 1, c, n, m, path);
            // return;
        }
        //default case
        path[r][c] = 0;
    }

  

    public static void main(String[] args) {
        int path[][] = new int[4][5];
        int matrix[][] = { { 0, 0, 0, 0, 1 }, { 0, 0, 1, 0, 0 }, { 0, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0 } };
        rIAM(matrix, 0, 0, 4, 5, path);
    }
}