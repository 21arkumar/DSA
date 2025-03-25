/*CodeForce Question: 2071A */
package CodeForces;
import java.util.*;
public class A2071 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long k = sc.nextInt();
            System.out.println((k%3 == 1) ? "YES" : "NO" );
        }
        sc.close();
    }
}
