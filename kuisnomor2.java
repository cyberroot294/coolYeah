import java.util.Scanner;
public class kuisnomor2 {

    public static void main(String[] args) {
        System.out.println("Program untuk Menentukan Gaji");
        Scanner input = new Scanner(System.in);

        double gaji;
        double pajak;
        double gajiSesudahPajak;
        double gajiAnak;
        int anak;

        System.out.println("Masukkan Gaji Anda =");
        gaji = input.nextDouble();

        if(gaji < 3000000) {
            pajak = 0.05*gaji;
            gajiSesudahPajak= gaji-pajak;
        }
        else {
            pajak = 0.1*gaji;
            gajiSesudahPajak = gaji-pajak;}

        System.out.println("Apakah Anda sudah menikah ?(tulis 1 jika sudah/tulis 0 jika belum");
        int status;
        status = input.nextInt();
        double TunjanganKesehatan = 0.05*gaji;
        if(status == 1) {
            System.out.println("Masukkan Jumlah Anak Anda =");
            anak = input.nextInt();
            if (anak == 0) {
                gajiAnak = gajiSesudahPajak;
                double gajiTotal = gajiAnak+TunjanganKesehatan;
                System.out.println("Gaji total anda adalah Rp" + gajiTotal);
            } else if(anak == 1) {
                gajiAnak = gajiSesudahPajak+100000;
                System.out.println("Gaji total anda adalah Rp" + gajiAnak + TunjanganKesehatan);
            } else if(anak >= 2) {
                gajiAnak = gajiSesudahPajak+200000;
                System.out.println("Gaji total anda adalah Rp" + gajiAnak + TunjanganKesehatan);
            } else if(status == 0) {
                gajiAnak = gajiSesudahPajak;
                System.out.println("Gaji total anda adalah Rp" + gajiAnak + TunjanganKesehatan);
            }
        }


        input.close();
    }
    }