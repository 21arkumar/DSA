package CodeForces;
import java.util.*;
public class A2070 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextInt();
            int rem = (int)n%14;
            int mul = (int)n/14;
            System.out.println((mul*4)+rem);
        }
        sc.nextInt();
    }
}
