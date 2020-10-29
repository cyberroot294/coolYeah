import java.util.Scanner;

/**
 * tes1234
 */
public class tes1234 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int a = in.nextInt();
        int b = in.nextInt();
        int counter = 0;
        int hasil = 0;
        while (counter != b) {
            if((b < 0 && a > 0) || (b < 0 && a < 0)){
                hasil += -a;
                counter--;
            }else{
                hasil += a;
                counter++;
            }
        }
        System.out.print(hasil);
        in.close();
    }
}