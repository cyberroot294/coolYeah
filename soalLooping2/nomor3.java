package soalLooping2;

import java.util.Scanner;

public class nomor3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nilai n : ");
        int n = in.nextInt();
        int temp = 0;
        for (int i = 1; i <= n; i++) {
            temp += i;
        }
        System.out.println(temp);
        in.close();
    }
}
