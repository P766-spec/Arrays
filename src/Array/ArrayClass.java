package Array;
import java.util.Arrays;
public class ArrayClass {
    // Java program to demonstrate Arrays class via binarySearch(
    //method

    public static void main(String[] args) {
        int[] arr = {10, 20, 15, 22, 35};
        Arrays.sort(arr);

        int key = 22;

        System.out.println(key + "found at index = " + Arrays.binarySearch(arr,key));
    }
}
