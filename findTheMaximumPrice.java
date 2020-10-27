import java.util.*;

public class findTheMaximumPrice {
    public static void main(String[] args) {
        int[] keyboards = {3, 1};
        int[] drives = {5, 2, 8};
        int b = 10;

        ArrayList<Integer> container = new ArrayList<Integer>();

        for(int i = 0; i < keyboards.length; i++){
            for(int j = 0; j < drives.length; j++){
                container.add(keyboards[i] + drives[j]);
            }
        }

        // System.out.println(Arrays.toString(container.toArray()));
        int max = -1;

        for (Integer num : container) {
            if (num <= b && num > max) {
                max = num;
                
                // System.out.println(num);
            }
        }

        System.out.println(max);


        
    }
}
