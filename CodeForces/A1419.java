package CodeForces;

import java.util.Scanner;

public class A1419 {
    public static void solve(long x){
        int count = 0;
        long stairSize = 1;
        long sum = 1;
        while(x>=sum){
            count++;
            x -= sum; 
            stairSize = stairSize * 2 + 1; 
            sum = (stairSize * (stairSize + 1)) / 2; 
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long x = sc.nextLong();
            solve(x);
        }
        sc.close();
    }
}
