package soalLooping2;

public class nomor5 {
    public static void main(String[] args) {
        int n1 = 1; // deklarasi n ke 1 fibonacci
        int n2 = 2; // deklarasi n ke 2 fibonacci
        for (int i = 0; i < 10; i++) {
            // print n
            System.out.print(n1 + " ");
            // operasi (n-1) + (n-2)
            int temp = n1 + n2;
            // swapping nilai
            n1 = n2;
            n2 = temp;
        }
    }
}
