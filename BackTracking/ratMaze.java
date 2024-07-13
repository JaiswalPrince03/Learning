package BackTracking;

public class ratMaze {
    public static boolean rIAM(int matrix[][], int r, int c, int n, int m, int path[][]) {
        // base case
        if (r == n - 1 && c == m - 1) {
            path[r][c] = 1;
            for(int i=0;i<4;i++)
            {
                for(int j=0;j<5;j++)
                {
                    System.out.print(path[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println();
            return false;
        }
        // recursive case
        // right move
        path[r][c] = 1;
        if (c + 1 < m && matrix[r][c + 1] == 0) {
            boolean canReach = rIAM(matrix, r, c + 1, n, m, path);
            if (canReach) {
                return true;
            }
        }
        // down move
        if (r + 1 < n && matrix[r + 1][c] == 0) {
            boolean canReach = rIAM(matrix, r + 1, c, n, m, path);
            if (canReach) {
                return true;
            }
        }
        //default case
        path[r][c] = 0;
        return false;
    }

  

    public static void main(String[] args) {
        int path[][] = new int[4][5];
        int matrix[][] = { { 0, 0, 0, 0, 1 }, { 0, 1, 1, 0, 0 }, { 0, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0 } };
        boolean foundPath = rIAM(matrix, 0, 0, 4, 5, path);
        if (foundPath) {
            System.out.println("Path found:");
            for(int i=0;i<4;i++)
            {
                for(int j=0;j<5;j++)
                {
                    System.out.print(path[i][j]+" ");
                }
                System.out.println();
            }
        } else {
            System.out.println("No path found.");
        }
    }
}