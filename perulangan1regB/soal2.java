package perulangan1regB;
import java.util.Scanner;
public class soal2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Program menghitung bilangan ganjil dari 1 hingga n");
        System.out.print("Masukkan nilai n : ");
        int n = in.nextInt();
        int jumlah = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 1) {
                jumlah += i;
            }
        }
        System.out.println(jumlah);
        in.close();
    }
}
