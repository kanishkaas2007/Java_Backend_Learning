package JavaSession1_operators;

import java.util.Scanner;

public class LeapYear {
    public static void main ( String[] args ) {

        Scanner n = new Scanner ( System.in ) ;

        System.out.print("enter a year:");
        int year = n.nextInt();

        String text = ((year % 4 == 0 & year % 100 != 0) || (year % 400 == 0) ? "its a leap year" : "its not a leap year");
        System.out.print(text);
    }
}

