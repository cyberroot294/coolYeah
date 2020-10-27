package soalLooping2;

import java.util.Scanner;

public class nomor9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nilai n : ");
        int n = in.nextInt();
        System.out.print("Masukkan nilai m : ");
        int m = in.nextInt();
        int nFakt = 1;
        for (int i = 1; i <= n; i++) {
            nFakt *= i;
        }
        int mFakt = 1;
        for (int i = 1; i <= m; i++) {
            mFakt *= i;
        }
        int X = nFakt / mFakt;
        System.out.println("Nilai X adalah : " + X);
        in.close();
    }
}
