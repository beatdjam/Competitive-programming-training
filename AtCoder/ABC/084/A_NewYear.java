import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer M = nextInt(sc);
        System.out.println(24-M+24);
        sc.close();
    }

    static int nextInt(Scanner sc){
        return Integer.parseInt(sc.next());
    }

}