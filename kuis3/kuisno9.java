package kuis3;
import java.util.Scanner;
public class kuisno9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program menentukan apakah persamaan kuadrat tidak memiliki akar, satu akar kembar atau dua akar berbeda");

        System.out.print("Masukkan nilai a (tidak boleh nol) : ");
        double a = input.nextDouble();

        System.out.print("Masukkan nilai b : ");
        double b = input.nextDouble();

        System.out.print("Masukkan nilai c : ");
        double c = input.nextDouble();

        double diskriminan = Math.pow(b, 2) - (4 * a * c);
        double sqrt = Math.sqrt(diskriminan);

        if(a!=0){
            if (diskriminan == 0) {
                double hasil = (-1*b + sqrt) / (2*a);
                System.out.println("Akar kembar yang nilainya x = " + hasil);
            }else if (diskriminan > 0){
                double hasil1 = (-1*b + sqrt) / (2*a);
                double hasil2 = (-1*b - sqrt) / (2*a);
                System.out.println("Akar yang ke-1 x =  " + hasil1 + ", Akar yang ke-2 x = " + hasil2);
            }else{
                System.out.println("Tidak memiliki akar / akar imajiner");
            }
        }else{
            System.out.println("Bukan persamaan kuadrat karena nilai a = nol");
        }
        input.close();

    }
}
