package JavaSession2_ControlStatement;

import java.util.Scanner;

public class printFibonacci {
    public static void main( String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of n:");
        int n = input.nextInt();

        int a = 0;
        int b = 1;

        System.out.print("Fibonacci series:");

        for ( int i = 1 ; i <= n ; i++) {
            System.out.print ( a + " " );
            int next = a + b ;
            a = b ;
            b = next ;

        }
    }
}
