import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String[] vals = sc.nextLine().split(" ");
        int A = sc.nextInt();
        int B = sc.nextInt();
        if(A * B * 1 % 2 == 1 || A * B * 3 % 2 == 1) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        sc.close();
    }
    static int getInt(String val) {return Integer.parseInt(val);}
    static long getLong(String val) {return Long.parseLong(val);}
}
