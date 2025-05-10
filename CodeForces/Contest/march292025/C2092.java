//incomplete
package Contest.march292025;

import java.util.Scanner;

public class C2092 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0;i<n; i++){
                arr[i] = sc.nextInt();
            }

            int i = 0;
            int j = 1;
            while(i < n || j < n){
                int sum = arr[i]+arr[j];
                if(sum % 2 == 0){
                    j++;
                }else{
                    
                }
            }
        }
        sc.close();
    }
}
