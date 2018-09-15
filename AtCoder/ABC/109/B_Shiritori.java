import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String[] vals = sc.nextLine().split(" ");
        int N = getInt(sc.nextLine());
        List words = new ArrayList<String>();
        String before = sc.nextLine();
        words.add(before);

        for(int i = 1;i < N;i++){
            String now = sc.nextLine();
            if(words.contains(now)){
                System.out.println("No");
                return;
            }
            if(before.charAt(before.length()-1) != now.charAt(0)){
                System.out.println("No");
                return;
            }
            before = now;
            words.add(now);
        }
        System.out.println("Yes");

        sc.close();
    }
    static int getInt(String val) {return Integer.parseInt(val);}
    static long getLong(String val) {return Long.parseLong(val);}
}
