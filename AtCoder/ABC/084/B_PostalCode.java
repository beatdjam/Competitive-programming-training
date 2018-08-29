import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = nextInt(sc);
        String b = sc.next();
        String s = sc.next();
        if(!(s.charAt(a) == '-')) {
            System.out.println("No");
        }else if(!s.substring(0, a -1).matches("^[0-9]*$")){
            System.out.println("No");
        }else if(!s.substring(a + 1).matches("^[0-9]*$")){
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
        sc.close();
    }

    static int nextInt(Scanner sc){
        return Integer.parseInt(sc.next());
    }

}