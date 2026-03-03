package JavaSession3_Arrays;

import java.util.Scanner;

public class sum2DArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int r = sc.nextInt();

        System.out.print("Enter columns: ");
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        System.out.println("Enter elements:");

        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int sum = 0;

        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                sum += arr[i][j];
            }
        }

        System.out.println("Sum of elements: " + sum);

        sc.close();
    }
}

