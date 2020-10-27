package soalLooping2;

import java.util.Scanner;

public class nomor10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nilai n : ");
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (i % 2 == 1) {
                    if (j % 2 == 0) {
                        System.out.print("#");
                    }else{
                        System.out.print("%");
                    }
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        in.close();
    }
}
