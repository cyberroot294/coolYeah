package soalLooping2;

import java.util.Scanner;

/**
 * nomor7
 */
public class nomor7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nilai n : ");
        int n = in.nextInt();
        for (int i = n; i > 0; i--) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        in.close();
    }
}