import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int N = getInt(s[0]);
        int M = getInt(s[1]);
        int X = getInt(s[2]);
        String[] A = sc.nextLine().split(" ");

        int countBefore = 0;
        int countAfter = 0;
        for(int i = 0;i < M;i++){
            int a = getInt(A[i]);
            if(a < X && a > 0){
                countBefore++;
            }else if(a < N && a > X){
                countAfter++;
            }
        }

        if(countAfter > countBefore){
            println(countBefore);
        }else{
            println(countAfter);
        }

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
    static void println(boolean val){System.out.println(val);}
}
