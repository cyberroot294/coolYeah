public class rekursif {
    public static void main(String[] args) {
        // System.out.println(faktorial(5));
        System.out.println(fibonacci(16));
    }

    // rekursif biasa
    static int faktorial(int num) {
        if (num == 1 || num == 0) {
            return 1;
        }
        return num * faktorial(num-1);
    }

    // rekursif bercabang
    static long fibonacci(long num){
        if (num == 1 || num == 2) {
            return 1;
        }
        
        return fibonacci(num-1) + fibonacci(num-2);
    }
}
