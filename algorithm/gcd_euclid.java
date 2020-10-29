package algorithm;

import java.util.Scanner;

public class gcd_euclid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.print(gcd(a, b));
        in.close();
    }

    public static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }

        return gcd(b, a % b);
    }
}
