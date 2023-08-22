package Matrix;
// https://practice.geeksforgeeks.org/problems/make-matrix-beautiful-1587115620/1

public class BeautifulMatrix {
    public static void main(String[] args) {
        int N = 3;
        int[][] matrix = {
                {1, 2, 3},
                {4, 2, 3},
                {3, 2, 1}
        };
        System.out.println(findMinOperation(N,matrix));
    }
    static int findMinOperation(int N, int[][] matrix){
        int sum = 0;
        for(int i =0; i<N; i++){
            for(int j =0; j<N; j++) {
                sum += matrix[i][j];
            }
        }

        int row_sum = 0;
        int col_sum   = 0;
        for(int i =0; i<N; i++){
            int a  = 0;
            for(int j= 0; j<N; j++){
                a += matrix[i][j];        // all row sum
            }
            row_sum = Math.max(row_sum, a);

            int b= 0;
            for(int j =0; j<N; j++){
                b += matrix[j][i];     // all column sum
            }
            col_sum = Math.max(col_sum, b);
        }
        int max = Math.max(col_sum , row_sum);

        return max * N - sum;
    }
}
