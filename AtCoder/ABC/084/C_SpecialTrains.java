import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = getInt(sc.nextLine());

        int[] c = new int[n-1];
        int[] s = new int[n-1];
        int[] f = new int[n-1];
        for(int i = 0;i < n-1;i++) {
            String[] vals = sc.nextLine().split(" ");
            c[i] = Integer.parseInt(vals[0]);
            s[i] = Integer.parseInt(vals[1]);
            f[i] = Integer.parseInt(vals[2]);
        }

        for(int j = 0;j < n-1;j++){
            int t = 0;
            for(int k = j;k < n-1;k++){
                if(t <= s[k]){
                    t = s[k];
                }else{
                    t += (t-s[k]) % f[k] == 0 ? 0 : f[k] - (t-s[k]) % f[k];
                }
                t += c[k];
            }
            System.out.println(t);
        }
        System.out.println(0);
        sc.close();
    }

    static int getInt(String val) {
        return Integer.parseInt(val);
    }
}