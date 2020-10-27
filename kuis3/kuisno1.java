package kuis3;
import java.util.Scanner;

public class kuisno1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program untuk mengecek suatu bilangan positif atau negatif");
        System.out.print("\nMasukkan bilangan bulat : ");
        int num = input.nextInt();

        if (num>0) {
            System.out.println("Angka yang anda masukkan adalah angka Positif");
        }else if (num == 0){
            System.out.println("Angka yang anda masukkan adalah nol (bukan positif ataupun negatif)");
        }else{
            System.out.println("Angka yang anda masukkan adalah angka Negatif");
        }
        
        input.close();
    }
}
