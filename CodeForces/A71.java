
import java.util.*;
public class A71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String str = sc.next();
            int len = str.length();
            if(len>10){
                String new_str = str.charAt(0) + String.valueOf(len - 2) + str.charAt(len - 1);
                System.out.println(new_str);
            }else{
                System.out.println(str);
            }
        }
        sc.close();
    }
}
