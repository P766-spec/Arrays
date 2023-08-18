package Array;

public class HCF {
    public static void main(String[] args) {
//        int a = 36, b = 60,  hcf = 1;
//
//        for(int i =1; i<= a || i <= b; i++){
//            if(a % i == 0 && b % i== 0)
//                hcf = i;
//        }
//        System.out.println("HCF is : " + hcf);
        //  Time Complexity : O(N)
        // Space Complexity: O(1)


    // Euclidean method
//    using subtraction like  m= 144, n = 32
//            m > n
//    m = m - n = 112, n = 32
//            m > n
//    m = m - n  = 112 - 32 = 80, n= 32
//            m > n
//    m = m - n = 80 - 32 = 48, n = 32
//            m > n
//    m = m - n = 48  -32 = 16, n = 32
//            now n > m
//    n  = n - m = 32 - 16 = 16
//            m = 16, n= 16 same, so stop

    int a = 144, b = 32, hcf  =1;
        while(a != b) {
        if (a > b) {
            a -= b;
        } else {
            b -= a;
        }
        }
        System.out.println("HCF is: " + a);
    }
}
