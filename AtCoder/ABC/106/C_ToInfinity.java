import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        long k = getLong(sc.nextLine());
 
        for(int i = 0;i < k ;i++){
            if(s.charAt(i) != '1'){
                System.out.println(s.charAt(i));
                return;
            }
        }
        System.out.println(1);
        sc.close();
    }
    static long getLong(String val) {
        return Long.parseLong(val);
    }
}
