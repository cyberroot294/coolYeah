package selection2;

import java.util.Scanner;
public class selection2no10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("Masukkan nilai i : ");
            int i = in.nextInt();
            if (i != 1) {
                System.out.println("Salah");
            }else{
                System.out.println("Benar");
                break;
            }
        }
        in.close();
    }
}
