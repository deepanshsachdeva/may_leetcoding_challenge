class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int color = image[sr][sc];
        if (color != newColor) fill(image, sr, sc, color, newColor);
        return image;
    }
    
    public void fill(int[][] image, int r, int c, int color, int newColor) {
        if (image[r][c] == color) {
            image[r][c] = newColor;
            if (r >= 1) fill(image, r-1, c, color, newColor);
            if (c >= 1) fill(image, r, c-1, color, newColor);
            if (r+1 < image.length) fill(image, r+1, c, color, newColor);
            if (c+1 < image[0].length) fill(image, r, c+1, color, newColor);
        }
    }
}