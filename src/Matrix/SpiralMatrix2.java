package Matrix;
//  https://leetcode.com/problems/spiral-matrix-ii/

public class SpiralMatrix2 {
    public static void main(String[] args) {
     int n = 3;
        System.out.println(generateMatrix(n));
    }

    static int[][] generateMatrix(int n) {
      int[][] matrix = new int[n][n];
             if(n <=0) return matrix;
             int num = 1, rowstart = 0, rowend = n - 1, colstart = 0, colend = n - 1;
             while(rowstart <= rowend && colstart <= colend) {
                 for(int i = colstart; i <= colend; i++)
                     matrix[rowstart][i] = num++;
                 rowstart++;

                 for(int i = rowstart;i <= rowend; i++)
                     matrix[i][colend] = num++;
                 colend--;

            for(int i = colend; i >= colstart; i--)
                     matrix[rowend][i] = num++;
                 rowend--;

                 for(int i = rowend; i >= rowstart; i--)
                matrix[i][colstart] = num++;
            colstart++;

             }
             return matrix;






    }
}
