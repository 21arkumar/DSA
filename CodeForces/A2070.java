package CodeForces;
import java.util.*;
public class A2070 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextInt();
            long rem = n%15;
            long mul = n/15;
            System.out.println((mul*3)+ Math.min(rem + 1, 3));
        }
        sc.close();
    }
}
