package selection2;
import java.util.Scanner;

public class selection2no1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program konversi Yen ke Rupiah");
        System.out.print("\nMasukkan jumlah angka Yen : ");
        float yen = input.nextFloat();

        float idr = yen*140;
        System.out.println(yen + " yen sama dengan " + idr + " rupiah");
        input.close();
    }
}
