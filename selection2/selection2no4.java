package selection2;

import java.util.Scanner;
public class selection2no4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Program menentukan satuan dari sebuah bilangan");
        System.out.print("\nMasukkan bilangan : ");
        float bil = in.nextFloat();
        int satuan = (int) bil % 10;
        System.out.println("Satuan dari bilangan " + bil + " adalah " + satuan);
        in.close();
    }
}
