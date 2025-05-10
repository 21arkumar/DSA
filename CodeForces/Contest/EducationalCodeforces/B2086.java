package Contest.EducationalCodeforces;
import java.util.Scanner;
public class B2086 {
    public static void solution(long[] arr, int n, long x) {
        long res = 0;
        for (int i = 0; i < n; i++) {
            long sum = 0;
            for (int j = i; j < n; j++){
                sum += arr[j];
                if(sum >= x){
                    res++;
                    break;
                }
            }
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            long x = sc.nextLong();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }
            long[] brr = new long[n * k];
            for (int i = 0; i < n * k; i++){
                brr[i] = arr[i % n];
            }
            solution(brr, n * k, x);
        }
        sc.close();
    }   
}
