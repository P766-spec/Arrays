package Array;

import java.util.*;
public class CountAllSubarray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, -3, 1, 1, 1, 4, 2, -3};
        int k  = 3;
        int cnt = findSubArraySum(arr,k);
        System.out.println(cnt);


    }
    static int findSubArraySum(int[] arr, int k){
        int n = arr.length;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int preSum = 0, cnt = 0;
        mpp.put(0, 1);
        for (int i = 0; i < n ; i++) {
            preSum += arr[i];

            int remove = preSum - k;

            cnt  +=   mpp.getOrDefault(remove,0);

            mpp.put(preSum, mpp.getOrDefault(preSum,0) + 1);

        }
        return cnt;

    }

}
