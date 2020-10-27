package soalLooping2;

public class nomor4 {
    public static void main(String[] args) {
        int temp = 0;
        for (int i = 3; i < 1000; i+=3) {
            temp += i;
        }
        for (int i = 5; i < 1000; i+=5) {
            temp += i;
        }
        System.out.println(temp);
    }
}
