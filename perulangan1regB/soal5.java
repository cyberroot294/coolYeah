package perulangan1regB;
// import java.util.Scanner;

public class soal5 {
    public static void main(String[] args) {
		int jumlah = 0;
        for (int i = 0; i <= 25; i++) {
			for (int j = 0; j <= 25; j++) {
				for (int k = 0; k <= 25; k++) {
					if (i+j+k == 25) {
						jumlah++;
						System.out.printf("\n%d + %d + %d = %d", i, j, k, i+j+k);
					}
				}
			}
		}
		System.out.println("\n" + jumlah);
    }
}
