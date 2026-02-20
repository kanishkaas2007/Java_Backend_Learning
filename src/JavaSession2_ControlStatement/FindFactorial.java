package JavaSession2_ControlStatement;

import java.util.Scanner;

public class FindFactorial {
     public static void main ( String[] args) {

         Scanner input = new Scanner ( System.in ) ;

         System.out.print ( "Enter a number to find factorial:" ) ;
         int number = input.nextInt();

         int fact = 1 ;
         for ( int i = 1; i <= number; i++ ) {
             fact *= i ;

         }

         System.out.println ( "Factorial = " + fact ) ;

     }
}
