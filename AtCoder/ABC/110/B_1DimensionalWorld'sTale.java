import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s1 = sc.nextLine().split(" ");
        String[] s2 = sc.nextLine().split(" ");
        String[] s3 = sc.nextLine().split(" ");
        int x = getInt(s1[2]);
        int y = getInt(s1[3]);
        List<String> list1 = Arrays.asList(s2);
        List<String> list2 = Arrays.asList(s3);
        Collections.sort(list1, Comparator.comparingInt(one -> Integer.parseInt(String.valueOf(one))));
        Collections.sort(list2, Comparator.comparingInt(one -> Integer.parseInt(String.valueOf(one))));
        int xMax = getInt(list1.get(list1.size() -1));
        int yMin = getInt(list2.get(0));
        boolean territoryFlag = xMax >= yMin ? true : false;
        boolean borderOver = xMax >= y || yMin <= x ? true : false;
        String warFlag = territoryFlag || borderOver ? "War" : "No War";
        println(warFlag);
    }
    static long getLong(String val) {return Long.parseLong(val);}
    static int getInt(String val) {
        return Integer.parseInt(val);
    }

    static void println(String val){System.out.println(val);};
    static void println(int val){System.out.println(val);};
    static void println(long val){System.out.println(val);};
    static void println(Object val){System.out.println(val);};
}
