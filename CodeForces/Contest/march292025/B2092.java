package CodeForces.Contest.march292025;

import java.util.Scanner;

public class B2092 {
    public static void solve(int n, String s1, String s2) {

        int odd1 = 0;
        int even1 = 0;

        int odd0 = 0;
        int even0 = 0;

        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) == '1') {
                if (i % 2 == 0) {
                    even1++;
                } else {
                    odd1++;
                }
            }

            if (s2.charAt(i) == '0') {
                if (i % 2 == 0) {
                    even0++;
                } else {
                    odd0++;
                }
            }
        }

        if (even1 <= odd0 && odd1 <= even0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String s1 = sc.next();
            String s2 = sc.next();
            solve(n, s1, s2);
        }
        sc.close();
    }
}
