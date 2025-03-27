package CodeForces.Contest.march252025;

import java.util.Scanner;

public class A2072 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int p = sc.nextInt();

            int num = (int) Math.ceil((double) Math.abs(k)/p);

            if(num <= n){
                System.out.println(num);
            }else{
                System.out.println(-1);
            }
        }
        sc.close();
    }
}
