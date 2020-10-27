package tes;
import java.util.Locale;
public class tes5 {
    public static void main(String[] args) {
        Locale bahasa = new Locale("id"); // Bahasa Indonesia

        int harga = 16117250;
        System.out.println( harga );
        System.out.printf("%,d \n", harga);
        System.out.printf(bahasa, "%,d \n", harga);
    }
}
