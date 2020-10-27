package kuis3;
import java.util.Scanner;

public class kuisno2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program untuk mengecek apakah suatu bilangan positif atau negatif");
        System.out.print("\nMasukkan bilangan bulat : ");
        int num = input.nextInt();

        String hasil = num > 0 ? "Angka yang anda masukkan 'Positif'" : num < 0 ? "Angka yang anda masukkan 'negatif'" : "Angka yang anda masukkan adalah nol\n";
        System.out.println(hasil);

        input.close();
    }
}
