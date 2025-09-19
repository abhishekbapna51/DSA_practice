package BFS-DFS;

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int original = image[sr][sc];
        if (original == color) return image; // no need to change
        
        dfs(image, sr, sc, original, color);
        return image;
    }

    private void dfs(int[][] image, int r, int c, int original, int newColor) {
        // boundary check
        if (r < 0 || c < 0 || r >= image.length || c >= image[0].length) return;

        // not the target color → stop
        if (image[r][c] != original) return;

        // fill with new color
        image[r][c] = newColor;

        // explore 4 directions
        dfs(image, r + 1, c, original, newColor);
        dfs(image, r - 1, c, original, newColor);
        dfs(image, r, c + 1, original, newColor);
        dfs(image, r, c - 1, original, newColor);
    }
}
