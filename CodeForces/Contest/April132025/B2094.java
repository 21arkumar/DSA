package Contest.April132025;

import java.util.Scanner;

public class B2094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = sc.nextInt();
        while(counter-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int t = sc.nextInt();
            int r = sc.nextInt();
            int i = 0;
            int j = 0;
            while(m-- > 0){
                if (i < r) {
                    i++;
                } else if (j > t) {
                    j--;
                }
            }
            System.out.println(j + " " + i);
        }
        sc.close();
    }
}
