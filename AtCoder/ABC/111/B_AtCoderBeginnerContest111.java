import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = getInt(sc.nextLine());

        if(S <= 111){
            println("111");
            return;
        }else if(S <= 222){
            println("222");
            return;
        }else if(S <= 333){
            println("333");
            return;
        }else if(S <= 444){
            println("444");
            return;
        }else if(S <= 555){
            println("555");
            return;
        }else if(S <= 666){
            println("666");
            return;
        }else if(S <= 777){
            println("777");
            return;
        }else if(S <= 888){
            println("888");
            return;
        }else{
            println(999);
            return;
        }

    }
    static long getLong(String val) {return Long.parseLong(val);}
    static int getInt(String val) {
        return Integer.parseInt(val);
    }

    static void println(String val){System.out.println(val);};
    static void println(int val){System.out.println(val);};
    static void println(long val){System.out.println(val);};
    static void println(Object val){System.out.println(val);};
}
