package Contest.April132025;

import java.util.Scanner;

public class C2094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] grid = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    grid[i][j] = sc.nextInt();
                }
            }
            int size = 2 * n;
            int[] p = new int[size + 1];
            boolean[] used = new boolean[size + 1];
            for (int s = 2; s <= size; s++) {
                for (int i = 0; i < n; i++) {
                    int j = s - i - 1;
                    if (j >= 0 && j < n) {
                        p[s] = grid[i][j];
                        used[grid[i][j]] = true;
                        break;
                    }
                }
            }
            for (int num = 1; num <= size; num++) {
                if (!used[num]) {
                    p[1] = num;
                    break;
                }
            }
            for (int i = 1; i <= size; i++) {
                System.out.print(p[i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
