package JavaSession1_operators;

import java.util.Scanner;

public class swap {

    public static void main(String[] args) {

        Scanner n = new Scanner ( System.in );

        System.out.print ( "enter 1st number:" );
        int a = n.nextInt();

        System.out.print ( "enter 2st number:" );
        int b = n.nextInt();

        a = a + b ;
        b = a - b ;
        a = a - b ;

        System.out.print("the values after swapping is :" + a + " " + b );

    }
}
