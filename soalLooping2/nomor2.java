package soalLooping2;

import java.util.Scanner;

public class nomor2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan 7 angka : ");
        int[] num = new int[7];
        for (int i = 0; i < 7; i++) {
            num[i] = in.nextInt();
        }

        for (int j = 0; j < num.length; j++) {
            int idMax = j;
            int max = num[j];
            
            // mencari index dengan value terbesar 
            for (int k = j+1; k < num.length; k++) {
                if (max < num[k]) {
                    idMax = k;
                    max = num[k];
                }
            }

            // swapping
            int temp;
            temp = num[j];
            num[j] = max;
            num[idMax] = temp;

        }

        // System.out.println(Arrays.toString(num));
        System.out.println("Angka terbesar ke 2 ialah : " + num[1]);
        in.close();
    }
}
