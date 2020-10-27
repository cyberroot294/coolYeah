package selection2;
import java.util.Scanner;

public class selection2no3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Program untuk menentukan kuadran berdasarkan koordinat yang diinputkan");
        System.out.print("\nMasukkan koordinat x : ");
        float x = in.nextFloat();
        System.out.print("\nMasukkan koordinat y : ");
        float y = in.nextFloat();

        if (x > 0 && y > 0) {
            System.out.println("Titik yang anda inputkan berada di kuadran 1");
        }else if(x < 0 && y > 0){
            System.out.println("Titik yang anda inputkan berada di kuadran 2");
        }else if (x < 0 && y < 0) {
            System.out.println("Titik yang anda inputkan berada di kuadran 3");
        }else if(x > 0 && y < 0){
            System.out.println("Titik yang anda inputkan berada di kuadran 4");
        }else if (x == 0 || y == 0) {
            if (x == 0) {
                System.out.println("Titik tersebut tidak berada dikuadran manapun, melainkan berada di sumbu X");
            }else{
                System.out.println("Titik tersebut tidak berada dikuadran manapun, melainkan berada di sumbu Y");
            }
        }
        in.close();
    }
}
