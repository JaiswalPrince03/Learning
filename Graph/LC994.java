package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class LC994 {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        Queue<int[]> queue = new LinkedList<>();
        int freshCount = 0;
        boolean[][] visited = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                    visited[i][j] = true;
                } else if (grid[i][j] == 1) { 
                    freshCount++;
                }
            }
        }

        int minutes = 0;
        while (!queue.isEmpty() && freshCount > 0) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] cell = queue.poll();
                for (int[] direction : directions) {
                    int x = cell[0] + direction[0];
                    int y = cell[1] + direction[1];
                    if (x >= 0 && x < m && y >= 0 && y < n && !visited[x][y] && grid[x][y] == 1) {
                        queue.offer(new int[]{x, y});
                        visited[x][y] = true;
                        freshCount--;
                    }
                }
            }
            minutes++;
        }

        return freshCount == 0 ? minutes : -1;
    }
}
