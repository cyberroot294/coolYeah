package kuis3;
import java.util.Scanner;
public class kuisno3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program menentukan apakah segitiga siku-siku atau tidak");
        System.out.print("\nMasukkan panjang sisi tegak (bil bulat): ");
        int sisiTegak = input.nextInt();
        System.out.print("\nMasukkan panjang sisi datar (bil bulat): ");
        int sisiDatar = input.nextInt();
        System.out.print("\nMasukkan panjang sisi miring (bil bulat): ");
        int sisiMiring = input.nextInt();

        if (sisiMiring == Math.sqrt(Math.pow(sisiTegak, 2) + Math.pow(sisiDatar, 2))) {
            System.out.println("\nSegitiga yang anda masukkan adalah segitiga siku-siku");
        }else{
            System.out.println("\nSegitiga yang anda masukkan bukan segitiga siku-siku");
        }

        input.close();
    }
}
