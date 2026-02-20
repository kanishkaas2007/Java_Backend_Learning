package JavaSession2_ControlStatement;

import java.util.Scanner ;

public class printDayName {
    public static void main( String[] args ) {

        Scanner input = new Scanner ( System.in ) ;

        System.out.print("Enter day from 1-7:") ;
        int day = input.nextInt() ;

        switch( day ) {
            case 1:
                System.out.println( "The day is sunday " ) ;
                break ;
            case 2:
                System.out.println( "The day is monday " ) ;
                break ;
            case 3:
                System.out.println( "The day is tuesday " ) ;
                break ;
            case 4:
                System.out.println( "The day is wednesday " ) ;
                break ;
            case 5:
                System.out.println( "The day is thursday " ) ;
                break ;
            case 6:
                System.out.println( "The day is friday " ) ;
                break ;
            case 7:
                System.out.println( "The day is saturday " ) ;
                break ;
            default:
                System.out.println( "Invalid input ") ;

        }
    }
}
