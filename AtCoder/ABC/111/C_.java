import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = getInt(sc.nextLine());
        String[] s = sc.nextLine().split(" ");

        Map<String,Integer> x = new HashMap<>();
        Map<String,Integer> y = new HashMap<>();

        // map初期化
        for(int i = 0; i < n;i++){
            if(i%2 == 0){
                x.put(s[i], 0);
            }else{
                y.put(s[i], 0);
            }
        }
        // 数カウント
        for(int i = 0;i < n;i++){
            if(i%2 == 0){
                x.put(s[i], x.get(s[i])+1);
            }else{
                y.put(s[i], y.get(s[i])+1);
            }
        }
        // xとyが1個ずつで、x != y
        if(x.size() == 1 && y.size() == 1 && !s[0].equals(s[1])){
            println(0);
            return;
        }

        // xとyが1個ずつで、x == y
        if(x.size() == 1 && y.size() == 1 && s[0].equals(s[1])){
            println(n/2);
            return;
        }

        // 一番多いやつ探す
        String xmax = s[0];
        for(String key : x.keySet()){
            int nowMax = x.get(xmax);
            int current = x.get(key);
            if(nowMax < current){xmax = key;}
        }
        String ymax = s[1];
        for(String key : y.keySet()){
            int nowMax = y.get(ymax);
            int current = y.get(key);
            if(nowMax < current){ymax = key;}
        }

        int stable = x.get(xmax) + y.get(ymax);
        //  最頻値が同じ場合再探索
        //  xの1番目とyの2番目 yの1番目とxの2番目 のうち数が大きい方を対象とする
        if(xmax.equals(ymax)) {
            String xmax2 = "";
            int countx = 0;
            for (String key : x.keySet()) {
                if (countx <= x.get(key) && !key.equals(xmax)) {
                    countx = x.get(key);
                    xmax2 = key;
                }
            }

            String ymax2 = "";
            int county = 0;
            for (String key : y.keySet()) {
                if (county <=  y.get(key) && !key.equals(ymax)) {
                    county = y.get(key);
                    ymax2 = key;
                }
            }

            stable = Math.max(x.get(xmax) + y.get(ymax2),x.get(xmax2) + y.get(ymax));
        }

        // 最頻値以外の数
        println(n - stable);
        return;
    }
    static long getLong(String val) {return Long.parseLong(val);}
    static int getInt(String val) {return Integer.parseInt(val);}
    static String[] split(String val) {return val.split(" ");}
    static List<String> toSortedList(String[] s){ return sortList(Arrays.asList(s));}
    static List<String> sortList(List<String> list){
        Collections.sort(list, Comparator.comparingInt(val -> Integer.parseInt(String.valueOf(val))));
        return list;
    }

    static void println(String val){System.out.println(val);}
    static void println(int val){System.out.println(val);}
    static void println(long val){System.out.println(val);}
}