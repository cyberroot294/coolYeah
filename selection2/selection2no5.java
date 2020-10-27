package selection2;

import java.util.Scanner;
public class selection2no5 {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.print("Masukkan jumlah buah naga : ");
        int buahNaga = in.nextInt();
        System.out.print("\nMasukkan jumlah teman : ");
        int teman = in.nextInt();
        if (teman != 0) {
            int hasilBagi = buahNaga / teman;
            int sisaBagi = buahNaga % teman;
            System.out.println("\nMasing - masing buah naga per orang adalah : " + hasilBagi);
            System.out.printf("Buah yang tersisa sebanyak %d buah", sisaBagi);
        }else{
            System.out.println("Input yang anda masukkan tidak valid, silahkan jalankan ulang program ini");
        }
        in.close();
    }
}
