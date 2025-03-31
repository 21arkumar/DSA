package CodeForces;
import java.util.*;
public class A144 {
    public static void totalSwap(int[] arr, int n){
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, maxIndx = -1, minIndx = -1;
        for(int i = 0; i<n; i++){
           if(arr[i]>max){
                max = arr[i];
                maxIndx = i;
           }
           if(arr[i] <= min){
                min = arr[i];
                minIndx = i;
           }
        }

        int res = (n-minIndx-1) + maxIndx; 
        if(minIndx < maxIndx){
            res -= 1;
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        totalSwap(arr, n);
        sc.close();
    }
}
