/*
Time Complexity: O(N), where N is the number of pixels in the image. We might process every pixel.
Space Complexity: O(N), the size of the implicit call stack when calling dfs.

*/
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int oldColor = image[sr][sc];
        if (oldColor != newColor)
            dfs(image, sr, sc, oldColor, newColor);
        return image;
    }

    public void dfs(int[][] image, int r, int c, int oldColor, int newColor) {
        if (image[r][c] == oldColor) {
            image[r][c] = newColor;
            if (r >= 1)
                dfs(image, r - 1, c, oldColor, newColor);
            if (c >= 1)
                dfs(image, r, c - 1, oldColor, newColor);
            if (r + 1 < image.length)
                dfs(image, r + 1, c, oldColor, newColor);
            if (c + 1 < image[0].length)
                dfs(image, r, c + 1, oldColor, newColor);
        }
    }
}