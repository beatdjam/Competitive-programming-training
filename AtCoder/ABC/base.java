import java.util.*;
import java.util.stream.Stream;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // 解答ここから
        return;
    }
    // 入力受け取り
    static String next(){return sc.nextLine();}
    static int nextInt(){return getInt(sc.nextLine());}
    static long nextLong(){return getLong(sc.nextLine());}
    static String[] arrayOfString(){return sc.nextLine().split(" ");}
    static int[] arrayOfInt(){return toIntArray(arrayOfString());}
    // 変換
    static long getLong(String val) {return Long.parseLong(val);}
    static int getInt(String val) {return Integer.parseInt(val);}
    static int[] toIntArray(String[] array) {return Stream.of(array.clone()).mapToInt(Integer::parseInt).toArray();}
    // 出力
    static void println(Object val){System.out.println(val);}
}
