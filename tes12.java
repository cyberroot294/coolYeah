import java.util.Arrays;
import java.util.Scanner;

public class tes12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        String[] arr = new String[len];
        for (int i = 0; i < len; i++) {
            arr[i] = in.next();
        } 
        String[] reverse = new String[arr.length];
        int temp = 0;
        for (String i : arr) {
            String reversed = "";
            for (int j = i.length()-1; j >= 0; j--) {
                reversed += String.valueOf(i.charAt(j));
            }
            reverse[temp] = reversed;
            temp++;
        }
        Arrays.sort(reverse);
        
        for (int i = 0; i < reverse.length; i++) {
            String reversed = "";
            for (int j = reverse[i].length()-1; j >= 0; j--) {
                reversed += String.valueOf(reverse[i].charAt(j));
            }
            reverse[i] = reversed;
        }

        System.out.print(Arrays.toString(reverse));
        in.close();
    }
}
