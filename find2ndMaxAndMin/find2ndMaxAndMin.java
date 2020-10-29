package find2ndMaxAndMin;

import java.util.Scanner;

public class find2ndMaxAndMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        in.close();
        secondMaxMin(n, arr);

    }

    public static void secondMaxMin(int n, int[] arr) {
        for (int i = 0; i < n; i++) {
            // asumsi nilai yang minus
            int min = arr[i];
            int idMin = i;

            for (int j = i+1; j < n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    idMin = j;
                }
            }

            // swapping
            int temp = arr[i];
            arr[i] = min;
            arr[idMin] = temp;

        }

        System.out.println("Nilai terkecil ke 2 ialah " + arr[1]);
        System.out.println("Nilai terbesar ke 2 ialah " + arr[n-2]);
    }
}
