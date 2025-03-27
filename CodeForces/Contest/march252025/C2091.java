package CodeForces.Contest.march252025;
import java.util.*;
public class C2091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            Integer arr[] = new Integer[n];
            if(n%2==0){
                System.out.println(-1);
                continue;
            }
            for(int i = 0; i<n; i++){
                arr[i] = i+1;
            }

            Arrays.sort(arr, Collections.reverseOrder());

            // for(int i = 0; i < n; i++){
            //     int value = ((i + 1) + i) % n;
            //     if(value == 0) {
            //         value = n;
            //     }
            //     arr[i+1] = value;
            // }

            // for(int i = 1; i <= n; i++){
            //     System.out.print(arr[i] + " ");
            // }
            // System.out.println();

            for(int e : arr){
                System.out.print(e + " ");
            }
        }
        sc.close();
    }
}
