//incomplete
package CodeForces.Contest.march292025;

import java.util.Scanner;

public class A2092 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] sheep = new int[n];
            for (int i = 0; i < n; i++) {
                sheep[i] = sc.nextInt();
            }
            int res = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    int diff = Math.abs(sheep[i] - sheep[j]);
                    if (diff > res) {
                        res = diff;
                    }
                }
            }
            System.out.println(res);
        }
        sc.close();
    }
}
