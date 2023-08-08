package Array;
// https://leetcode.com/problems/max-chunks-to-make-sorted/

public class MaxChunks {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 4};
        System.out.println(maxChunksToSorted(arr));

    }
    static int maxChunksToSorted(int[] arr) {
        if(arr == null || arr.length == 0){
            return 0;
        }
        int[]  l = new int[arr.length];
        l[0] = arr[0];
        int[] r = new int[arr.length + 1];
        r[r.length - 1] = arr.length;
        for(int i  =1; i<arr.length; i++){
            l[i] = Math.max(arr[i], l[i - 1]);
        }
        for(int i = arr.length - 1; i >= 0; i--){
            r[i] = Math.min(arr[i], r[i + 1]);
        }
        int cnt = 0;
        for(int i = 0; i<arr.length; i++){
            if(l[i] <= r[i+1]) {
                cnt++;
            }
        }
        return cnt;

    }
}
