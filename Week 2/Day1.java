/*
If there are only 2 points, they are always on a straight line.
If there are more than two points, the slope between any two points should be same
(if they are on a straight line).
slope between two points (x1, y1), (x2, y2) = (y2-y1)/(x2-x1).
*/
class Solution {
    public double find_slope(int[] x, int[] y) {
        int x1 = y[0];
        int y1 = y[1];
        int x2 = x[0];
        int y2 = x[1];
        double slope = (double) (y2 - y1) / (double) (x2 - x1);
        return slope;
    }

    public boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length == 2) {
            return true;
        }
        double slope = find_slope(coordinates[1], coordinates[0]);
        for (int i = 2; i < coordinates.length; i++) {
            double slope2 = find_slope(coordinates[i], coordinates[i - 1]);
            if (slope != slope2) {
                return false;
            }
        }
        return true;
    }
}