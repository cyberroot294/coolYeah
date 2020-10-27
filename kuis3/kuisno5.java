package kuis3;
import java.util.Scanner;
public class kuisno5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program untuk menentukan boleh atau tidaknya seseorang menonton film berdasarkan usianya");
        System.out.print("\nBerapa umur anda : ");
        int umur = input.nextInt();
        if (umur >= 17) {
            System.out.println("Anda boleh nonton");
        }else if(umur>= 0 && umur < 17){
            System.out.println("Anda tidak boleh nonton");
        }else{
            System.out.println("Usia yang anda inputkan tidak valid");
        }
        input.close();
    }
}
