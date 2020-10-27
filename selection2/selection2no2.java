package selection2;
import java.util.Scanner;
public class selection2no2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Program menghitung biaya parkir");
            System.out.print("\nMasukkan jam ketika anda masuk (1-12) : ");
            int jamMasuk = input.nextInt();
            System.out.print("\nMasukkan jam ketika anda keluar (1-12) : ");
            int jamKeluar = input.nextInt();

            if (jamMasuk > jamKeluar) {
                System.out.println("Jam yang anda masukkan tidak valid, harap jalankan ulang program ini !!!");
                continue;
            }
            int lamaParkir = jamKeluar - jamMasuk;
            int biaya = 0;
            if(jamMasuk <= 0 || jamKeluar > 12){
                System.out.println("Jam yang anda masukkan tidak valid, harap jalankan ulang program ini !!!");
                continue;
            }else if (lamaParkir > 2) {
                biaya = 4000 + ((lamaParkir - 2) * 1000);
            }else if (lamaParkir <= 2 && lamaParkir > 0){
                biaya = 2000 * lamaParkir;
            }else if(lamaParkir == 0){
                biaya = 2000;
            }else if (lamaParkir < 0 || lamaParkir > 12) {
                System.out.println("Jam yang anda masukkan tidak valid, harap jalankan ulang program ini !!!");
                continue;
            }

            System.out.println("Total biaya yang harus anda bayar adalah " + biaya);
            input.close();
            break;
        }
    }
}
