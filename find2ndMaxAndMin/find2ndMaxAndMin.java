package find2ndMaxAndMin;
import java.util.Scanner;

public class find2ndMaxAndMin {
    public static void main(String[] args) {
		int n = 0; 
		int j = 0; 
		int nilai[];
		int counter = 0; // untuk menghitung banyak elemen yang sama di dalam array
		Scanner input = new Scanner (System.in);
		
		System.out.print("Masukkan n banyaknya nilai : ");
		n = input.nextInt();
		
		nilai = new int [n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Masukkan nilai ke-" + (i + 1) + " : ");
			nilai [i] = input.nextInt();
		}
		
		secondMaxMin(n, j, nilai, counter);
		input.close();
	}

    private static void secondMaxMin(int n, int j, int[] nilai, int counter) {
        int wadah;
        for (int i = 0; i < n; i++) {
			for (j = 0; j < (n-1); j++) {
				if (nilai[j] >= nilai [(j+1)]) {

					// swapping
					wadah = nilai[j];
					nilai[j] = nilai [(j+1)];
					nilai [(j+1)] = wadah;
				} 

				if (nilai[j] == nilai [(j+1)]) {
					nilai [j] = 0;
				}
			}
		}
		
		for (int i : nilai) {
			if (i == 0) {
				counter++;
			}
		}

		System.out.println("Nilai Maks ke dua " + nilai[(j-1)]);

		int k = 0;;
		for (int i = 0; i < n; i++) {
			for (k = n-1; k >= 1; k--) {
				if (nilai[k] <= nilai [k-1]) {

					// swapping
					wadah = nilai[k];
					nilai[k] = nilai [k-1];
					nilai [k-1] = wadah;
				} 
				if (nilai[k] == nilai [k-1]) {
					nilai [k] = 0;
				}
			}
		}

		System.out.println("Nilai Min ke dua " + nilai[k+1+counter]);
    }
}
