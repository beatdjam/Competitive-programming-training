import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String T = sc.nextLine();
        Map<String,String> map = new HashMap<>();
        // アルファベットの対応表をマッピングする
        for(int i = 0;i < T.length();i++){
            char t = T.charAt(i);
            char s = S.charAt(i);
            // 対応表登録済みのアルファベットに異なる文字が対応したらNoで終了
            if(map.containsKey(String.valueOf(s)) && !map.get(String.valueOf(s)).equals(String.valueOf(t))){
                println("No");
                return;
            }
            map.put(String.valueOf(s),String.valueOf(t));
        }
        // 対応表に重複する文字があればNoを出力する
        long count = map.values().stream().distinct().count();
        long count2 = map.values().stream().count();
        println(count != count2 ? "No" : "Yes");
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
