package CodeForces;

import java.util.Scanner;

public class A1175 {
    public static long minSteps(long n, long k){
        long count = 0;
        while(n!=0){
            long temp = 1;
            if(n%k==0){
                n /= k;
            }else{
                temp = n%k;
                n -= temp;
            }
            count+=temp;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long k = sc.nextLong();

            System.out.println(minSteps(n, k));
        }
        sc.close();
    }
}
