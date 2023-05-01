package Array;
// https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
public class AverageSalary {
    public static void main(String[] args) {
        int[] salary= { 2000, 4000, 6000, 5000};
        System.out.println(average(salary));

    }
    static double average(int[] salary) {
        int minSalary = Integer.MAX_VALUE;
        int maxSalary = Integer.MIN_VALUE;
        int n = salary.length;
        double sum = 0;
        for(int i : salary) {
            minSalary = Math.min(i, minSalary);
            maxSalary = Math.max(i, maxSalary);
            sum += i;
        }
        sum = sum - minSalary - maxSalary;
        return sum / (n - 2);
    }
}
