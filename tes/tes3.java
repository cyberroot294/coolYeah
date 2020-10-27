package tes;
public class tes3 {
    public static void main(String[] args) {
        // for (int i = 1; i <= 5; i++) {
        //     for (int j = 0; j <= 20; j++) {
        //         if (j%5 == 0) {
        //             System.out.print("$");
        //         }else{
        //             System.out.print("*");
        //         }
        //     }
        //     System.out.println();
        // }
        // System.out.println("halo");
        int bil = 357;
        int satuan = bil % 10;
        System.out.println(satuan);
        int puluhan = (bil % 100)-satuan;
        int ratusan = bil % 1000 - puluhan;
        System.out.printf("%d %d %d %d", bil, ratusan, puluhan, satuan);
        
    }
}
