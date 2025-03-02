package Homework;

import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        int n, i, k, j;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number of rows: ");
        n = scanner.nextInt();
        scanner.close();

        for (i = 1; i <= n; i++) {
            for (k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }
            for (j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
