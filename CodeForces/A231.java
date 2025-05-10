
import java.util.Scanner;

public class A231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int solvable = 0;
        while(t-- > 0){
            int count = 0;
            for(int i = 0; i<3; i++){
                if(sc.nextInt() == 1){
                    count++;
                }
            }

            if(count>=2){
                solvable++;
            }

        }

        System.out.println(solvable);
        sc.close();
    }
}
