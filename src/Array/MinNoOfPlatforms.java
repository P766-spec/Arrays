package Array;
//  https://www.geeksforgeeks.org/minimum-number-platforms-required-railwaybus-station/

import java.util.*;
public class MinNoOfPlatforms {
    public static void main(String[] args) {
        int[] arr = { 900, 940, 950, 1100, 1500, 1800 };
        int[] dept = { 910, 1200, 1120, 1130, 1900, 2000};
        int n = arr.length;
        System.out.println("Minimum number of Platforms required = " + findPlatform(arr, dept, n));

    }
    static int findPlatform(int[] arr, int[] dept, int n){
        Arrays.sort(arr);
        Arrays.sort(dept);

        int platform_needed = 1, ans = 1;
        int i  =1, j = 0;

        while( i < n && j < n){
            if(arr[i] <= dept[j]){
                platform_needed++;
                i++;
            }
            else if (arr[i] > dept[j]){
                platform_needed--;
                j++;
            }

            if(platform_needed > ans)
                ans = platform_needed;
        }

        return ans;
    }
}
