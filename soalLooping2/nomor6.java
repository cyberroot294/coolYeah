package soalLooping2;

import java.util.Scanner;

public class nomor6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nilai n : ");
        int n = in.nextInt();
        int n1 = 1; // deklarasi n ke 1 fibonacci
        int n2 = 2; // deklarasi n ke 2 fibonacci
        int hasil = 0;
        for (int i = 0; i < n; i++) {

            if (n1 % 2 == 0 && n1 < 1000) { // check apakah nilai n genap dan kurang dari 1000
                hasil += n1;
            }

            int temp = n1 + n2; // operasi fibonacci (n-1) + (n-2)
            System.out.print(n1 + " ");
            // swapping
            n1 = n2;
            n2 = temp;
        }
        System.out.println(hasil);

        in.close();
    }
}
