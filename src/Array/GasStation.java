package Array;
// https://leetcode.com/problems/gas-station/

public class GasStation {
    public static void main(String[] args) {
        int[] gas = {1, 2, 3, 4, 5};
        int[]  cost = {3, 4, 5, 1,2};
        System.out.println(canCompleteCircuit(gas, cost));
    }
    static int canCompleteCircuit(int[] gas, int[] cost) {
        int curr =0, prev =0, idx =0;
        for (int i = 0; i < gas.length; i++) {
            curr += gas[i] - cost[i];
            if(curr < 0){
                prev += curr;
                idx = i+1;
                curr =0;
            }
        }
        if(curr + prev >= 0) return idx;
        return -1;
    }
}
