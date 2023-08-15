package Array;
// https://www.geeksforgeeks.org/stack-data-structure/

import java.util.*;
public class FlipBits {
    public static void main(String[] args) {
        int n = 5;
        int[] a = {1, 0, 0, 1, 0};
        System.out.println(maxOnes(a,n));

    }
    static int maxOnes(int []a, int n){
        int zero = 0;
        int one = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if(a[i] == 0){
                zero++;
            } else {
                one++;
                zero--;
            }
            max = Math.max(max, zero);
            if(zero < 0){
                zero = 0;
            }

        }
        return one + max;
    }
}
