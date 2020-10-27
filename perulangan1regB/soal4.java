package perulangan1regB;

import java.util.Scanner;
public class soal4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nilai n : ");
        int n = in.nextInt();
        for (int i = n; i > 0; i--) {
            for (int j = i-1; j > 0; j--) {
                System.out.print("!");
            }
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }        
        in.close();
    }
}
