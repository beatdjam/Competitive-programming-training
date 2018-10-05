import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        StringBuilder sb = new StringBuilder();

        for (int j = 0;j < S.length();j++){
            if(S.charAt(j) == '1') {
                sb.append('9');
            } else if(S.charAt(j) == '9') {
                sb.append('1');
            } else{
                sb.append(S.charAt(j));
            }
        }
        S = sb.toString();
        println(S);
        return ;
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
