public class tes123 {
    public static void main(String[] args) {
        int n = 10;
        for(int i = n; i > 0; i--){
            if(i % 3 == 1 ){
                n*=i;
            }else{
                n+=i;
            }
        }
        System.out.print(n);
    }
}
