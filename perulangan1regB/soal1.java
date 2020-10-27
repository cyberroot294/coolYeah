package perulangan1regB;

import java.util.Scanner;

// import jdk.internal.util.xml.impl.Input;
public class soal1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan sembarang karakter : ");
        String karakter = in.nextLine();
        for (int i = 0; i < karakter.length(); i++) {
            if (karakter.charAt(i) == '.') {
                karakter = karakter.substring(0,i);
                // System.out.println();
            }
        }
        System.out.printf("Jumlah karakter yang dibaca : %s, karakternya ialah : %s", karakter.length(), karakter);
        in.close();
    }
}
