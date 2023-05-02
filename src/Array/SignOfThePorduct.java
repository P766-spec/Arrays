package Array;
// https://leetcode.com/problems/sign-of-the-product-of-an-array/
public class SignOfThePorduct {
    public static void main(String[] args) {
         int[] nums = {-1, -2, -3, -4, 3 ,2 ,1};
        System.out.println(arraySign(nums));

    }
    static  int arraySign(int[] nums) {
        int ans = 0;
        for(int i  =0; i <nums.length; i++){
            if(nums[i] == 0){
                return 0;
            }
            if(nums[i] < 0){
                ans++;
            }
        }
        return ans % 2 ==0 ? 1 : -1;
    }
}
