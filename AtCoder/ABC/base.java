import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static PrintWriter pw = new PrintWriter(System.out);
    public static void main(String[] args) throws IOException {
        func();
        pw.flush();
        return;
    }

    static void func() throws IOException {
        // 解答
    }
    // 入力受け取り
    static String next() throws IOException {return br.readLine();}
    static int nextInt() throws IOException{return getInt(br.readLine());}
    static long nextLong() throws IOException{return getLong(br.readLine());}
    static String[] arrayOfString() throws IOException{return br.readLine().split(" ");}
    static int[] arrayOfInt() throws IOException{return toIntArray(arrayOfString());}
    // 変換
    static long getLong(String val) {return Long.parseLong(val);}
    static int getInt(String val) {return Integer.parseInt(val);}
    static int[] toIntArray(String[] array) {
        return Stream.of(array.clone()).mapToInt(Integer::parseInt).toArray();
    }
    static String joinToString(String[] array) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < array.length;i++) sb.append(array[i]);
        return sb.toString();
    }
    static int[] listToIntArray(List<Integer> list){
        int[] ret = new int[list.size()];
        for(int i = 0;i < ret.length;i++) {
            ret[i] = list.get(i);
        }
        return ret;
    }

    // 計算系
    static int[] getDivisor(int val){
        List<Integer> divisor = new ArrayList<>();
        for (int i = 1; i*i <= val; i++) {
            if (val % i != 0) continue;
            divisor.add(i);
            divisor.add(val/i);
        }
        int[] result = listToIntArray(divisor);
        Arrays.sort(result);
        return result;
    }
    static int[] getPrime(int from, int to){
        return IntStream.rangeClosed(from, to)
                .filter(i -> IntStream.rangeClosed(2, (int)Math.sqrt(i)).allMatch(j -> i%j !=0))
                .toArray();
    }


    // 出力
    static void println(Object val){pw.println(val);}
}