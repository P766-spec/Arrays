package Array;
//  https://leetcode.com/problems/number-of-subarrays-with-bounded-maximum/

public class SubarraysWithBoundedMaximum {
    public static void main(String[] args) {
        int[] nums = {2, 1, 4, 3};
        int left = 2;
        int right = 3;

        System.out.println(numSubarrayBoundedMax(nums, left, right));

    }
    static int numSubarrayBoundedMax(int[] nums, int left, int right){
        int j = 0, cnt = 0, ans = 0;

        for(int i = 0; i<nums.length; i++){
            if(nums[i] >= left && nums[i] <= right) {
                ans+= i - j  + 1; cnt = i - j + 1;  // to get sum contiguous subarrays --> for cnt++ we will not get contiguous subarray
            }
            else if(nums[i] < left){
                ans += cnt;
            } else {
                j = i + 1;
                cnt = 0;
            }
        }
        return ans;
    }
}
