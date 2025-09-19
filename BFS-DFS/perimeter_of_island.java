package BFS-DFS;

class Solution {
    public int islandPerimeter(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int peri = 0;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(grid[i][j]==1){
                    peri += dfs(grid, i, j);
                }
            }
        }
        return peri;
    }

    private int dfs(int[][] grid, int i, int j){

        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length) return 1;
        if(grid[i][j] == 0) return 1;
        if(grid[i][j] == 2) return 0;

        grid[i][j] = 2;

        
        int perimeter = 0;
        perimeter += dfs(grid, i + 1, j);
        perimeter += dfs(grid, i - 1, j);
        perimeter += dfs(grid, i, j-1);
        perimeter += dfs(grid, i, j+1);

        return perimeter;
    }
}