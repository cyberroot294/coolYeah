package selection2;

import java.util.Scanner;
public class selection2no6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Program untuk menentukan apakah suatu bilangan ribuan, puluhribuan, ratusan atau satuan");
        System.out.print("Masukkan bilangan : ");
        String num = in.nextLine();
        int bil = Integer.parseInt(num);
        if (bil>=0) {
            switch (num.length()) {
                case 1:
                    System.out.println("Satuan");
                    break;
                case 2:
                    System.out.println("Puluhan");
                    break;
                case 3:
                    System.out.println("Ratusan");
                    break;
                case 4:
                    System.out.println("Ribuan");
                    break;
                case 5:
                    System.out.println("Puluhribuan");
                    break;
                default:
                    System.out.println("Bilangan yang anda masukkan tidak valid");
                    break;
            }
        }else{
            switch (num.length()) {
                case 2:
                    System.out.println("Satuan");
                    break;
                case 3:
                    System.out.println("Puluhan");
                    break;
                case 4:
                    System.out.println("Ratusan");
                    break;
                case 5:
                    System.out.println("Ribuan");
                    break;
                case 6:
                    System.out.println("Puluhribuan");
                default:
                    System.out.println("Bilangan yang anda masukkan tidak valid");
                    break;
            }
        }
        
        in.close();
    }
}
