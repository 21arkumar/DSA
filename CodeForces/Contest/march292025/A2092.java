
package CodeForces.Contest.march292025;

import java.util.Scanner;

public class A2092 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] sheep = new int[n];
            int max_num = Integer.MIN_VALUE;
            int min_num = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                sheep[i] = sc.nextInt();
                if(sheep[i] > max_num){
                    max_num = sheep[i];
                }
                if(sheep[i] < min_num){
                    min_num = sheep[i];
                }
            }

            System.out.println(max_num - min_num);
            
        }
        sc.close();
    }
}
