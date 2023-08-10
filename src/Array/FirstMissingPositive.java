package Array;
// https://leetcode.com/problems/first-missing-positive/

import java.util.*;
public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {3,4,-1,1};
        System.out.println(firstMissingPositiveNumber(nums));

    }

    static int firstMissingPositiveNumber(int[] nums){
        int i = 0;
        while(i < nums.length){
            if(nums[i] > 0 && nums[i] <= nums.length && nums[i]  != nums[nums[i] - 1]) {
                swap(nums, i, nums[i] - 1);
            } else {
                i++;
            }
        }
        for(i = 0; i<nums.length; i++){
            if(nums[i] != i   + 1){  // " i + 1" for 1 - based indexing
                return i  +1;
            }
        }
        return nums.length + 1;
    }
    private static  void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
