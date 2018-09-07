import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] vals = sc.nextLine().split(" ");
        long N = getLong(vals[0]);
        long K = getLong(vals[1]);
        long a = 0;
        long b = 0;
        for(long i = 1;i <= N;i++){
            if (i % K == 0) a++;
            if (K % 2 == 0 && i % K == K/2) b++;
        }
        System.out.println(a * a * a + b * b * b);
        sc.close();
    }
    static int getInt(String val) {
        return Integer.parseInt(val);
    }
    static long getLong(String val) {
        return Long.parseLong(val);
    }
}
