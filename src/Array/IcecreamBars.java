package Array;
import java.util.Arrays;
// https://leetcode.com/problems/maximum-ice-cream-bars/

public class IcecreamBars {
    public static void main(String[] args) {
        int[] costs = { 1, 3, 2, 4, 1};
        int coins  = 7;
        System.out.println(maxIcecream(costs, coins));
    }
    static int maxIcecream(int[] costs, int coins) {
        int icecream = 0;
        Arrays.sort(costs);
        for (int i = 0; i < costs.length ; i++) {
            if(costs[i] <= coins){
                coins -= costs[i];
                icecream++;
            }
        }
        return icecream;
    }
}
