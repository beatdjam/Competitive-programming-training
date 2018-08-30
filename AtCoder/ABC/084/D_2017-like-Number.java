import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = getInt(sc.nextLine());

        // エラトステネスの篩
        // https://gist.github.com/greymd/19ed7f18c0eba7e703ac2a6b69225ca8
        boolean[] isPrime = new boolean[100000];
        IntStream.rangeClosed(2, 100000)
                .filter(i -> IntStream.rangeClosed(2, (int)Math.sqrt(i)).allMatch(j -> i%j !=0))
                .forEach(x -> isPrime[x] = true);
        // 1〜その数までで2017に近い数の個数リストを作る
        int[] list = new int[100000];
        int count = 0;
        for (int i = 0;i < 100000;i++) {
            if(isPrime[i] && isPrime[(i+1)/2]) count++;
            list[i] = count;
        }
        // lからrまでの2017に近い数を出す
        for (int i = 0;i < n;i++){
            String[] line = sc.nextLine().split(" ");
            int l = Integer.parseInt(line[0]);
            int r = Integer.parseInt(line[1]);
            System.out.println(list[r] - list[l-1]);
        }
        sc.close();
    }
    static int getInt(String val) {
        return Integer.parseInt(val);
    }
}