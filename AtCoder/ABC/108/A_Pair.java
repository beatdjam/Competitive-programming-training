import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = getInt(sc.nextLine());
        int count = 0;
        for(int i = 1;i < K;i++){
            for(int j = i+1;j <= K;j+=2){
                count++;
            }
        }
//        int N = getInt(s[0]);
        System.out.println(count);
        sc.close();
    }
    static int getInt(String val) {
        return Integer.parseInt(val);
    }
    static long getLong(String val) {
        return Long.parseLong(val);
    }
}
