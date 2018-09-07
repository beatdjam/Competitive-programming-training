import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] vals = sc.nextLine().split(" ");
        int x1 = getInt(vals[0]);
        int y1 = getInt(vals[1]);
        int x2 = getInt(vals[2]);
        int y2 = getInt(vals[3]);

        int xDiff = Math.abs(x2 - x1);
        int yDiff = Math.abs(y2 - y1);

        boolean isXPlus = x2 - x1 > 0;
        boolean isYPlus = y2 - y1 > 0;

        // ズレてるケースだけ
        int x3 = 0;
        int y3 = 0;
        int x4 = 0;
        int y4 = 0;
        if (isXPlus && isYPlus) {
            x3 = x2 + (yDiff * -1);
            y3 = y2 + xDiff;

            x4 = x3 + (xDiff * -1);
            y4 = y3 + (yDiff * -1);
        }
        if (!isXPlus && isYPlus) {
            x3 = x2 + (yDiff * -1);
            y3 = y2 + (xDiff * -1);

            x4 = x3 + xDiff;
            y4 = y3 + (yDiff * -1);
        }
        if (!isXPlus && !isYPlus) {
            x3 = x2 + yDiff;
            y3 = y2 + (xDiff * -1);

            x4 = x3 + xDiff;
            y4 = y3 + yDiff;
        }
        if (isXPlus && !isYPlus) {
            x3 = x2 + yDiff;
            y3 = y2 + xDiff;

            x4 = x3 + (xDiff * -1);
            y4 = y3 + yDiff;
        }

        System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
        sc.close();
    }
    static int getInt(String val) {
        return Integer.parseInt(val);
    }
    static long getLong(String val) {
        return Long.parseLong(val);
    }
}
