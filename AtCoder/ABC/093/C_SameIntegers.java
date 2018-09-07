import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int A = getInt(s[0]);
        int B = getInt(s[1]);
        int C = getInt(s[2]);
        int max = Math.max(A,B);
            max = Math.max(max,C);

        // maxとABCの差を2で割ってあまりを取得
        int remA = (max - A) % 2;
        int remB = (max - B) % 2;
        int remC = (max - C) % 2;

        // あまりを取り除いて2の倍数で何回操作が必要か計算する
        int result = 0;
        result += (max - A - remA) != 0 ? (max - A - remA) / 2 : 0;
        result += (max - B - remB) != 0 ? (max - B - remB) / 2 : 0;
        result += (max - C - remC) != 0 ? (max - C - remC) / 2 : 0;

        // あまりがすべて0でない場合は追加の操作が必要なので+1
        if(remA != 0 || remB != 0 || remC != 0 ) result++;
        // 奇数が一つだけの場合は更に追加の操作が必要なので+1
        if((remA + remB + remC) % 2 != 0 ) result++;
        System.out.println(result);
        sc.close();
    }
    static int getInt(String val) {
        return Integer.parseInt(val);
    }
    static long getLong(String val) {
        return Long.parseLong(val);
    }
}
