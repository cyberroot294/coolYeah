package kuis3;
import java.util.Scanner;
public class kuisno10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Program menentukan grid nilai huruf");
        System.out.print("\nMasukkan nilai dalam bentuk angka : ");
        double angka = input.nextDouble();

        if(angka > 86){
            System.out.println("Nilai anda adalah A");
        }else if(angka <= 86 && angka > 71 ){
            System.out.println("Nilai anda adalah B");
        }else if(angka <= 71 && angka > 56){
            System.out.println("Nilai anda adalah C");
        }else if (angka <= 56 && angka > 41){
            System.out.println("Nilai anda adalah D");
        }else{
            System.out.println("Nilai anda adalah E");
        }

        input.close();

    }
}
