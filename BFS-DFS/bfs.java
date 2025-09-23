package BFS-DFS;

class Solution {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;

        // Step 1: enqueue all rotten oranges and count fresh
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 2) {
                    q.offer(new int[]{i, j}); // start nodes
                } else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        if (fresh == 0) return 0; // nothing to rot

        // Step 2: run BFS
        int minutes = bfs(grid, q, fresh);

        return minutes;
    }

    // BFS template adapted for grid
    private int bfs(int[][] grid, Queue<int[]> q, int fresh) {
        int rows = grid.length, cols = grid[0].length;
        int minutes = -1;
        int[][] dirs = {{1,0}, {-1,0}, {0,1}, {0,-1}};

        while (!q.isEmpty()) {
            int size = q.size();
            minutes++; // each layer = 1 minute

            for (int s = 0; s < size; s++) {
                int[] cell = q.poll();
                int r = cell[0], c = cell[1];

                for (int[] d : dirs) {
                    int nr = r + d[0], nc = c + d[1];

                    if (nr >= 0 && nc >= 0 && nr < rows && nc < cols && grid[nr][nc] == 1) {
                        grid[nr][nc] = 2; // make rotten
                        fresh--;
                        q.offer(new int[]{nr, nc});
                    }
                }
            }
        }

        return fresh == 0 ? minutes : -1;
    }
}
