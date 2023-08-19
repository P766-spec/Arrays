package Array;
// https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/

public class ReplaceELements {
    public static void main(String[] args) {
        int[] arr = {17,18,5,4,6,1};
        int[] val = replaceElements(arr);
        for(int num : val) {
            System.out.println(num + " ");
        }


    }
    static int[] replaceElements(int[] arr){
        int max = -1;
        for(int i = arr.length  -1; i >= 0; i--){
            if(arr[i] > max) {
                int temp = max;
                max = arr[i];
                arr[i] = temp;
            }
            else {
                arr[i] = max;
            }
        }
        return arr;
    }
}
