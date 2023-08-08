package Array;
// https://leetcode.com/problems/max-chunks-to-make-sorted-ii/

public class maxChunks2 {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        System.out.println(maxChunksToSorted2(arr));

    }
    static int maxChunksToSorted2(int[] arr){
        int n = arr.length;
        int[] maxLeft = new int[n];
        int[] minRight = new int[n];

        maxLeft[0] = arr[0];
        for(int i = 1; i<n; i++){
            maxLeft[i] = Math.max(maxLeft[i - 1], arr[i]);
        }
        minRight[n - 1] = arr[n - 1];
        for(int i = n - 2; i >= 0; i--){
            minRight[i] = Math.min(minRight[ i + 1], arr[i]);
        }
        int ans = 0;
        for(int i = 0; i < n - 1; i++){
            if(maxLeft[i]  <= minRight[i + 1]) ans++;
        }
        return ans + 1;
    }
}
