package JavaSession1_operators;

import java.util.Scanner;

public class tempSwap {

    public static void main(String[] args){

        Scanner n=new Scanner(System.in);

        System.out.print ( "enter 1st value to swap:" );
        int a = n.nextInt();

        System.out.print ( "enter 2st value to swap:" );
        int b = n.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.print( "after swapping" + a +" "+ b);

    }
}
