package JavaSession2_ControlStatement;

import java.util.Scanner;

public class GreatestOfThreeNumbers {

    public static void main (String[] args) {

        Scanner input = new Scanner ( System.in );
        System.out.print("Enter three numbers:");

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int largest ;
         if (a >= b && a >= c)
             largest = a;
         else if ( b >= a && b >= c)
             largest = b;
         else
             largest = c;

         System.out.println("Largest number is:" + largest) ;


    }
}
