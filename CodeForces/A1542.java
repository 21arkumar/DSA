/*CodeForces Question 1542A */
package CodeForces;
import java.util.*;
public class A1542{
    public static void solve(int[] arr, int size){
        int even = 0;
        int odd = 0;
        
        for(int i = 0; i<size; i++){
            if(arr[i]%2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        if(even == odd){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int arr[] = new int[2*n];
            for(int i = 0; i<2*n; i++){
                arr[i] = sc.nextInt();
            }
            solve(arr, 2*n);
        }
        sc.close();
    }
}