
package tes;
import java.util.Scanner;

class tes {
    public static void main(String args[]){
       Scanner input = new Scanner( System.in );
       System.out.print("Enter a binary number: ");
       String binaryString =input.nextLine();
       System.out.println("Output: "+Integer.parseInt(binaryString,2));

       input.close();

    }
}

