// https://www.hackerrank.com/challenges/jumping-on-the-clouds-revisited/problem
// soal hackerrank

public class jumpingOnTheCloudsRevisited {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 0};
        int k = 2;
        System.out.print(jumping(arr, k));
    }   
    
    public static int jumping(int[] arr, int k) {
        int energy = 100;

        int i = 0;
        int temp = 0;
        do{
            temp = i + k;
            if(arr[temp % arr.length ] == 1){
                energy -= 3;
            }else{
                energy--;
            }
            i = temp;
        }while(temp % arr.length != 0);

        return energy;
    }
}
