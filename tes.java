
// import java.util.Scanner;

public class tes {
    public static void main(String[] args) {
        // System.out.println(Sn(5));
        // System.out.println(faktorial(5));
        int hasil = pangkat(2, 3);
        System.out.println(hasil);
        // System.out.println(fibonacci(3));
    }

    private static int Sn(int a){
        
        if (a == 0) {
            return 0;
        }
        
        return a + Sn(a-1);
    }

    private static int faktorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * faktorial(n-1);
    }

    private static int fibonacci(int n) {
        if (n == 1 || n == 0) {
            return n;
        }

        return fibonacci(n-1) + fibonacci(n-2);
    }

    private static int pangkat(int bil, int n) {
        if (n == 1) {
            return bil;
        }
        return bil * pangkat(bil, n-1);
    }
}
