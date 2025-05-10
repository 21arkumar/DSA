
import java.util.*;

public class B1975 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            int sElem = Integer.MAX_VALUE;
            for(int i = 0; i<n; i++){
                arr[i] = sc.nextInt();
                sElem = Math.min(sElem, arr[i]);
            }
            for(int i = 0; i<n; i++){
                if(arr[i]%sElem == 0){
                    arr[i] = 0;
                }
            }
            
            sElem = Integer.MAX_VALUE;
            for(int i = 0; i<n; i++){
                if(arr[i] != 0){
                    sElem = Math.min(sElem, arr[i]);
                }
            }
            for(int i = 0; i<n; i++){
                if(arr[i] != 0 && arr[i]%sElem == 0){
                    arr[i] = 0;
                }
            }
            int flag = 0;
            for(int i = 0; i<n; i++){
                if (arr[i]!=0){
                    flag = 1;
                    break;     
                }
            }
            if(flag == 0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}