package Array;
// https://leetcode.com/problems/range-addition-ii/

import java.util.*;
public class RangeAddition2 {
    public static void main(String[] args) {
        int m = 3, n = 3;
        int[][] ops = {
                {2, 2},
               {3, 3},
        };
        System.out.println(maxCount(m,n,ops));

    }
    static int maxCount(int m , int n , int[][] ops){
        for (int i = 0; i < ops.length ; i++) {
            if(ops[i][0] < m) m = ops[i][0];
            if(ops[i][1] < n) n = ops[i][1];

        }
        return n * m;
    }
}
