public class createPhoneNumber {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,0};
        System.out.print(phoneNumber(numbers));
    }

    public static String phoneNumber(int[] numbers) {
        // Your code here!
        String res = "(";
        for(int i = 0; i < numbers.length; i++){
          res += Integer.toString(numbers[i]);
          if(i == 2){
            res += ") ";
          }else if(i == 5){
            res+= "-";
          }
        }
        return res;
      }
}
