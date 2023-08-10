package Array;
// https://leetcode.com/problems/trapping-rain-water/

import java.util.*;
public class TrappingRainWater {
    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(arr));

    }
    static int trap(int[] arr){
        int n = arr.length;
        int[] maxL = new int[n];
        int[] maxR = new int[n];

        maxL[0] = arr[0];
        for(int i =1; i<n; i++){
            maxL[i] = Math.max(maxL[i - 1], arr[i]);
        }
        maxR[n-1] = arr[n - 1];
        for(int i = n -2; i>=0; i--){
            maxR[i] = Math.max(maxR[i + 1], arr[i]);
        }
        int[] water = new int[n];
        for(int i =0; i<n; i++){
            water[i] = Math.min(maxL[i], maxR[i]) - arr[i];
        }
        int sum = 0;
        for(int i =0; i<n; i++){
            sum += water[i];
        }
        return sum;
    }
}
