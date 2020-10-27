public class hoi {
    public static void main(String[] args) {
        
        dua();
    }

    public static long dua() {
        int n = 1000;
        long counter = 0;
        for (int i = 1; i < n; i++) {
            // if(i % 15 == 0){
            //     continue;
            // }else 
            if(i % 3 == 0 || i % 5 == 0){
                counter += i;
            }
        }
        System.out.print(counter);
        return counter;
    }

    public static long satu() {
        int n = 1000;
        long counter = 0;
        for (int i = 1; i <= n; i++) {
            counter = counter + (i * i);
        }
        System.out.print(counter);
        return counter;
    }

    public static int fibonacci() {
        int n = 45;
        int x1 = 1;
        int x2 = 2;
        int counter = 0;
        for (int i = 0; i < n; i++) {
            // hasil jumlah untuk x2
            int temp = x1 + x2;

            // kondisi
            if (x1 < 1000000 && x1 % 2 == 0) {
                counter += x1;
                // System.out.println("counter saat ini " + counter);
            }
            // System.out.print(x1 + " ");

            // swapping
            x1 = x2;
            x2 = temp;
        }

        System.out.print(counter);
        return counter;
    }
}
