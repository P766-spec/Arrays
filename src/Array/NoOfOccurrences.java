package Array;
// https://practice.geeksforgeeks.org/problems/number-of-occurrence2259/1

import java.util.*;
public class NoOfOccurrences {
    public static void main(String[] args) {
        int n = 7;
        int x = 2;
        int[] arr = {1, 1, 2, 2, 2, 2, 3};
        System.out.println(count(arr, n, x));
    }
    // brute force
//    static int count(int[] arr, int n, int x){
//        int cnt = 0;
//        for (int i = 0; i<=(arr.length - 1); i++){
//            if(arr[i] == x)
//                cnt++;
//        }
//        return cnt;
//    }

    // Optimized : Binary Search --> O(logn)
    static int count(int[] arr, int n, int x){
        int l = 0;
        int r = n  -1;
        while(l < r){
            int mid = l + (r - l)/2;
            if(arr[mid] == x){
                while(arr[l] != x) l++;
                while(arr[r] != x) r--;
                return r -  l + 1;   // no of occurrences
            }
            else if (arr[mid] > x){
                r = mid - 1;
            }
            else {
                l = mid + 1;
            }
        }
        return 0;
    }
}
