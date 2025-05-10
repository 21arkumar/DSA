package Contest.April132025;
import java.util.*;
public class A2094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String[] str = sc.nextLine().split(" ");
            String res = "";
            for(String s : str){
                res += s.charAt(0);
            }
            System.out.println(res);
        }
        sc.close();
    }
}
