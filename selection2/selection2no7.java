package selection2;
import java.util.Scanner;
public class selection2no7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan panjang persegi : ");
        int panjang = in.nextInt();
        System.out.print("Masukkan lebar persegi : ");
        int lebar = in.nextInt();

        for (int baris = 1; baris <= lebar; baris++) { //perulangan 1
            for (int kolom = 1; kolom <= panjang; kolom++) { //perulangan 2
                if (baris == 1 || baris == lebar || kolom == 1 || kolom == panjang) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        in.close();
    }
}
