package kuis3;
import java.util.Scanner;
public class kuisno6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program untuk menentukan boleh atau tidaknya seseorang menonton film berdasarkan usianya");
        System.out.print("Berapa umur anda : ");
        int umur = input.nextInt();
        String hasil = umur >= 17 ? "Anda boleh nonton" : umur >= 0 && umur < 17 ? "Anda tidak boleh nonton" : "Usia yang anda inputkan tidak valid";

        System.out.println(hasil);
        input.close();
    }
}
