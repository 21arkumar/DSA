package CodeForces.Contest.march252025;

import java.util.Scanner;

public class D2091 {
    public static void benchLength(int n, int m, int k){
        int maxBench = (int)Math.ceil(k/n);
        int gap = m-maxBench;
        int res = (int) Math.ceil(maxBench/gap+1);
        System.out.println(res);
    }
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            benchLength(n, m, k);
        }
    }
}
