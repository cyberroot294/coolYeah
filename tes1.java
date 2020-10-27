import java.util.Scanner;

public class tes1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // System.out.print("Masukkan nilai n : ");
        // int n = in.nextInt();
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < (n*2)-(i*2); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        in.close();
        // printTriangle(n);
    }

    public static String printTriangle(int count) {
        if (count == 0) return "";
        // System.out.println(p);
        String p = printTriangle(count - 1);
        p = p + "*";
        System.out.println(p);
        return p;
    }

    
}
