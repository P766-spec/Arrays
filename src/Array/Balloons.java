package Array;
// https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/
import java.util.Arrays;

public class Balloons {
    public static void main(String[] args) {
        int[][] points = {
                {10,16},{2,8},{1,6},{7,12}
        };
        System.out.println(findMinArrowShots(points));
    }
    static int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int arrow = 1;
        int end = points[0][1];
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > end) {
                arrow++;
                end = points[i][1];
            }
        }
        return arrow;
    }
}
