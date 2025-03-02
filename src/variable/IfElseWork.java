package variable;

import java.util.Scanner;

public class IfElseWork {
    public static void main(String[] args) {
        double average;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert Math score: ");
        int math = scanner.nextInt();
        System.out.print("Insert Khmer score: ");
        int khmer = scanner.nextInt();
        System.out.print("Insert English score: ");
        int english = scanner.nextInt();
        System.out.print("Insert Physics score: ");
        int physics = scanner.nextInt();

        // Calculate average
        average = (math + khmer + english + physics) / 4.0;

        // Determine grade using `||` correctly
        if ((average > 90) || (average <= 100 && average > 90)) {
            System.out.println("You're in grade A!");
        } else if ((average > 80) || (average <= 90 && average > 80)) {
            System.out.println("You're in grade B!");
        } else if ((average > 70) || (average <= 80 && average > 70)) {
            System.out.println("You're in grade C!");
        } else if ((average > 60) || (average <= 70 && average > 60)) {
            System.out.println("You're in grade D!");
        } else if ((average > 50) || (average <= 60 && average > 50)) {
            System.out.println("You're in grade E!");
        } else if ((average >= 0) || (average <= 50 && average >= 0)) {
            System.out.println("You're failed!");
            System.out.println("Please try again!");
        } else {
            System.out.println("Invalid input! Please enter valid scores.");
        }

        scanner.close();
    }
}
