package Array;
// https://practice.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1

import java.util.*;
public class Leaders {
    public static void main(String[] args) {
        int n = 6;
        int[] arr ={16,17,4,3,5,2};
        System.out.println(leaders(arr,n));

    }
    static ArrayList<Integer> leaders (int[] arr, int n){
        ArrayList<Integer> leader = new ArrayList<>();
        int maxi = Integer.MIN_VALUE;
        for (int i = n - 1; i >= 0 ; i--) {
            if(arr[i] >= maxi) leader.add(arr[i]);
            maxi = arr[i] > maxi ? arr[i] : maxi;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = leader.size() - 1; i  >= 0 ; i--) {
            ans.add(leader.get(i));
        }
        return ans;

    }
}
