import java.util.Scanner;

/**
 * faktorialForLooping
 */
public class faktorialForLooping {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nilai n : ");
        int n = in.nextInt();
        int hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil = hasil * i;
        }
        System.out.println(hasil);
        in.close();
    }
}