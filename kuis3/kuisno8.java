package kuis3;
import java.util.Scanner;
public class kuisno8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program menentukan apakah persamaan kuadrat tidak memiliki akar, satu akar kembar atau dua akar berbeda");

        System.out.print("Masukkan nilai a (tidak boleh nol): ");
        double a = input.nextDouble();

        System.out.print("Masukkan nilai b : ");
        double b = input.nextDouble();

        System.out.print("Masukkan nilai c : ");
        double c = input.nextDouble();

        double hasil = Math.pow(b, 2) - (4 * a * c);

        if(a!=0){
            if (hasil == 0) {
                System.out.println("Satu akar kembar");
            }else if (hasil > 0){
              System.out.println("Dua akar berbeda");
            }else{
                System.out.println("Tidak memiliki akar / akar imajiner");
            }
        }else{
            System.out.println("Bukan persamaan kuadrat karena nilai a = 0");
        }
        input.close();

    }
}
