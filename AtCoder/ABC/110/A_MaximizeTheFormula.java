import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        String a = s[0];
        String b = s[1];
        String c = s[2];
        int max = 0;
        max = max < getInt(a+b)+getInt(c) ?getInt(a+b)+getInt(c) : max;
        max = max < getInt(a+c)+getInt(b) ?getInt(a+c)+getInt(b) : max;
        max = max < getInt(b+a)+getInt(c) ?getInt(b+a)+getInt(c) : max;
        max = max < getInt(b+c)+getInt(a) ?getInt(b+c)+getInt(a) : max;
        max = max < getInt(c+a)+getInt(b) ?getInt(c+a)+getInt(b) : max;
        max = max < getInt(c+b)+getInt(a) ?getInt(c+b)+getInt(a) : max;
        println(max);
    }
    static long getLong(String val) {return Long.parseLong(val);}
    static int getInt(String val) {
        return Integer.parseInt(val);
    }

    static void println(String val){System.out.println(val);};
    static void println(int val){System.out.println(val);};
    static void println(long val){System.out.println(val);};
}
