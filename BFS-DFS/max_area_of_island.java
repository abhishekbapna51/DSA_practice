package BFS-DFS;

class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int maxarea = 0;

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                if (grid[r][c] == 1) {
                    // explore this island and get its area
                    int area = dfs(grid, r, c);
                    maxarea = Math.max(maxarea, area);
                }
            }
        }
        return maxarea;
    }

    private int dfs(int[][] grid, int r, int c){
        if(r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] == 0){
            return 0;
        }
        grid[r][c] = 0;
        int area = 1;
        
        area += dfs(grid, r+1, c);
        area += dfs(grid, r-1, c);
        area += dfs(grid, r, c - 1);
        area += dfs(grid, r, c+1);
        return area;
    }
}