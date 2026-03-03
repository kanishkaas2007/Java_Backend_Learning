package JavaSession3_Arrays;

import java.util.Scanner;

public class patternPrint4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {

            for(int j = 0; j < i; j++) {
                System.out.print("  ");
            }

            for(int k = i; k < n; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        sc.close();
    }
}

