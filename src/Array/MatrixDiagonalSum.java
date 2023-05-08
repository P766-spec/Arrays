package Array;
// https://leetcode.com/problems/matrix-diagonal-sum/

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(diagonalSum(mat));

    }
    static int diagonalSum(int[][] mat) {
        int ans = 0;
        int n = mat.length;
        for(int i =0; i<n; i++) {
            ans += mat[i][i];
            ans += mat[n-1-i][i];
        }
        return n % 2 == 0 ? ans: ans - mat[n/2][n/2];
    }
}
