package CodeForces.Contest.march252025;
import java.util.*;
public class A2091 {
    public static boolean allZero(int[] freq){
        for(int f : freq){
            if(f != 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int flag = 0, iter = 0;
            int[] freq = new int[]{3, 1, 2, 1, 0, 1};
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i<n; i++){
                arr[i] = sc.nextInt();
            }

            for(int i = 0; i<n; i++){
                if(arr[i] < freq.length && freq[arr[i]] > 0){
                    freq[arr[i]]--;
                }
                iter++;
                if(allZero(freq)){
                    flag = 1;
                    break;
                }
            }
            if(flag == 1){
                System.out.println(iter);
            }else{
                System.out.println(0);
            }
        }
        sc.close();
    }
}
