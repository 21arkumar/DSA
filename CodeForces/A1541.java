/*Code forces question 1541A */

import java.util.*;
public class A1541 {
    public static void swap(int[] arr, int j){
        arr[j] = arr[j] ^ arr[j+1];
        arr[j+1] = arr[j] ^ arr[j+1];
        arr[j] = arr[j] ^ arr[j+1];

    }
    public static void permutation(int n){
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = i+1;
        }
        
        int j = 0;
        while(j<n){
            if(n%2==0){
                swap(arr, j);
                j+=2;
            }else{
                if(j != n-1){
                    swap(arr, j);
                    j+=2;
                }else{
                    swap(arr, j-1);
                    j+=2;
                }
            }
        }

        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            permutation(n);
        }
        sc.close();
    }
}
