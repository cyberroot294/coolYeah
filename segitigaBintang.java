import java.util.Scanner;

public class segitigaBintang {

    public static void main(String[] args) {
        choosing();
    }   

    public static void choosing() {
        Scanner in = new Scanner(System.in);
        System.out.println("Bentuk segitiga");
        System.out.println("1. Siku siku ke kanan");
        System.out.println("2. Siku siku ke kiri");
        System.out.println("3. Segitiga sama sisi");
        System.out.print("Pilih bentuk segitiga : ");
        int n = in.nextInt();

        System.out.print("Masukkan jumlah baris : ");
        int baris = in.nextInt();

        switch (n) {
            case 1:
                segitigaSikuKeKanan(baris);
                break;
            case 2:
                segitigaSikuKekiri(baris);
                break;
            case 3:
                segitigaSamaSisi(baris);
                break;
            case 4:
                segitigaSikuKeKanan(baris);
                break;
            default:
                System.err.println("\nInput anda tidak valid");
                System.err.println("Silahkan masukkan ulang\n");
                choosing();
                break;
        }

        in.close();
    }

    public static void segitigaSikuKeKanan(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void segitigaSikuKekiri(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < (n-1)-i) {
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void segitigaSamaSisi(int n) {
        // -------------------------------------------------------------------------

        // ini mengeprint bintang dengan pola bintang nya ada spasi
        // contoh =   *
        //           * *
        //          * * *

        // -------------------------------------------------------------------------

        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n; j++) {
        //         if (j <= n-i) {
        //             System.out.print(" ");
        //         }else{
        //             System.out.print("* ");
        //         }
        //     }
        //     System.out.println();
        // }

        // --------------------------------------------------------------------------

        // dan ini mengeprint dengan pola tanpa spasi dibintang nya
        // contoh =   *  
        //           ***
        //          *****

        // --------------------------------------------------------------------------

        int temp = n-1; // variabel bantuan untuk membuat spasi
        for (int i = 1; i <= n; i++) {
            for (int j = temp; j >= 1; j--) {
                System.out.print(" ");
            }
            temp--; // decrement untuk variabel bantuan, biar spasinya ikut berkurang

            // perulangan buat ngeprint bintangnya
            for (int j = 1; j <= (i+i)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
