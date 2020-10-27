package kuis3;
import java.util.Scanner;

public class kuisno12{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] harga = {0, 7500, 4000, 3500, 5000};
        // int milo = 7500;
        // int kopi = 4000;
        // int tehBotol = 3500;
        // int jusMangga = 5000;
        double[] jumlah = new double[4];


        System.out.println("Selamat datang");
        for (int i = 0; i < 4; i++) {
            System.out.println("\n1. Milo         = Rp7.500   (kode = 1)");
            System.out.println("2. Kopi         = Rp4.000   (kode = 2)");
            System.out.println("3. Teh Botol    = Rp3.500   (kode = 3)");
            System.out.println("4. Jus Mangga   = Rp5.000   (kode = 4)");
            System.out.print("\nSilahkan masukkan kode minuman yang ingin anda beli (Masukkan 0 jika telah selesai memilih barang): ");
            int temp = input.nextInt();

            

            System.out.print("\nBerapa banyak yang ingin anda beli (Masukkan 0 jika telah selesai memilih barang) : \n");
            int temp2 = input.nextInt();

            jumlah[i] = harga[temp]*temp2;

            if (jumlah[i] == 0) {
                break;
            }

            
        }

        double belumDisc = 0;
        for (double num : jumlah) {
            belumDisc += num;
        }
        
        double hasil = belumDisc > 100000 ? belumDisc-(.15*belumDisc) : belumDisc > 50000 && belumDisc <= 100000 ? belumDisc-(.075*belumDisc) : belumDisc;
        System.out.println("\n\nHarga sebelum diskon adalah " + belumDisc);
        System.out.println("Harga setelah diskon adalah " + hasil);
        System.out.println("\nTotal biaya yang harus anda bayar adalah Rp" + hasil);

        input.close();
    }
}
