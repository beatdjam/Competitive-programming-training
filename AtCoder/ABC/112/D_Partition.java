import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
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
        int[] input = arrayOfInt();
        int n = input[0];
        int m = input[1];

        // 1.N個の数が最大公約数Dを持つということから、
        // 　その合計値のMの約数にもDを含んでいることがわかる。
        // 2.MがDを約数としているとき、D×NがMを超えると成立しなくなるので、
        //   取りうるDの最大値はM/Nとなる
        // ex.) ・N = 3 M = 14のとき、Mの約数は 1 2 7となる
        //      ・最大公約数が7のとき、数列は全て7以上となるため、
        //      　最低値の7×3でも21となり成立しない。
        //      ・最大公約数が2のとき、数列は全て2以上となるため、
        //      　最低値の2×3は6となり、取りうる最大公約数となる。
        int MAX = (int)Math.floor(m/n);

        // 最大値を求める問題なので、取りうる最大値からマイナスして成立するものを探すほうが早い
        long ans = 1;
        for(int i = MAX;1 < i;i--){
            if (m%i == 0){
                ans = i;
                break;
            }
        }
        println(ans);
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
    static int[] toIntArray(String[] array) {return Stream.of(array.clone()).mapToInt(Integer::parseInt).toArray();}
    static String joinToString(String[] array) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < array.length;i++) sb.append(array[i]);
        return sb.toString();
    }

    // 出力
    static void println(Object val){pw.println(val);}
}