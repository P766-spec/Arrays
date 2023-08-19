package Array;
//  https://practice.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1

import java.util.*;
public class SubarrayGivenSum {
    public static void main(String[] args) {
        int n = 5;
        int s = 12;
        int[] arr = {1,2,3,7,5};
        System.out.println(subarraySum(arr,n,s));

    }
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        ArrayList<Integer> ans = new ArrayList<>();
        int low = 0;
        int high = 0;
        int sum = 0;
        while( high < n){
            sum += arr[high];
            while(sum > s && low < high){
                sum -= arr[low];
                low++;
            }
            if(sum == s){
                ans.add(low + 1);  // return index --> 1-based indexing so + 1
                ans.add(high + 1);
                return ans;
            }
            high++;
            if(sum == 0)
                low = high;

        }
        ans.add(-1);  // no subarray
        return ans;
    }
}
