package JavaSession1_operators;
import java.util.Scanner;

public class ArithmeticOperator{

    public static void main(String[] args){

        Scanner n = new Scanner(System.in);

        System.out.print("enter the value of 1st number");
        int A = n.nextInt();

        System.out.print ("enter the value of 2ns number");
        int B =  n.nextInt();

        System.out.println ( "the addition value of the numbers are:" + ( A+B ) );
        System.out.println ( "the subtraction value of the numbers are:" + ( A-B ) );
        System.out.println ( "the multiplication value of the numbers are:" + ( A*B ) );
        System.out.println ( "the division value of the numbers are:" + ( A/B ) );
        System.out.println ( "the modulus value of the numbers are:" + ( A%B ) );


    }
}
