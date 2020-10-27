package soalLooping2;

import java.util.Scanner;

public class nomor1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nilai n : ");
        int n = in.nextInt();

        // int temp = 3;
        // for (int i = 0; i < n; i++) {
        //     System.out.printf("%d ", temp);
        //     temp += 6;
            
        // }
        
        for (int i = 3; i <= n*6; i+=6) {
            System.out.printf("%d ", i);
        }
        in.close();
    }
}
