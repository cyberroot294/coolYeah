package soalLooping2;

import java.util.Scanner;

public class nomor8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        int x = 1;
        while (x != 0) {
            System.out.print("Masukkan nilai n : ");
            n = in.nextInt();
            for (int i = n; i > 0; i--) {
                if (n % i == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.print("\nMasukkan 0 jika ingin berhenti : ");
            x = in.nextInt();
            
        }
        in.close();
    }
}
