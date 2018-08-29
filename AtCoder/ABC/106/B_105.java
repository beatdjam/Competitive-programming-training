import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer a = nextInt(sc);
        if(a < 105) {
            System.out.println(0);
        }else{
            int num = 1;
            for(int i = 107;i <= a;i+=2){
                if(result(i)) num++;
            }
            System.out.println(num);
        }
        sc.close();
    }

    static int nextInt(Scanner sc){
        return Integer.parseInt(sc.next());
    }

    static boolean result(Integer a){
        int count = 0;
        for (int i = 1;i <= a;i++){
            if(a % i == 0) {
                count++;
                if(count > 8){
                    return false;
                }
            }
        }
        if(count == 8) {
            return true;
        }else{
            return false;
        }
    }

}