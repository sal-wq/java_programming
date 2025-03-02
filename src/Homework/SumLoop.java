package Homework;

import java.util.Scanner;

public class SumLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            displayCalculatorMenu();
            int operation = getOperation(input);
            if (operation == 0) {
                System.out.println("Exiting...");
                break;
            }
            double num1 = getNumber(input, "Enter the first number: ");
            double num2 = getNumber(input, "Enter the second number: ");

            // Check for division by zero
            if (operation == 4 && num2 == 0) {
                System.out.println("Error: Cannot divide by zero. Try again.");
                continue;
            }

            double result = calculateResult(num1, num2, operation);
            displayResult(result);
        }
        input.close();
    }

    public static void displayCalculatorMenu() {
        System.out.println("\n 0 - Exit \n 1 - Addition (+) \n 2 - Subtraction (-) \n 3 - Multiplication (*) \n 4 - Division (/)");
    }

    public static int getOperation(Scanner input) {
        int operation;
        while (true) {
            System.out.print("Choose the operator by entering the number: ");
            if (input.hasNextInt()) {
                operation = input.nextInt();
                if (operation >= 0 && operation <= 4) {
                    return operation;
                }
            } else {
                input.next(); // Clear invalid input
            }
            System.out.println("Invalid input. Please enter a number between 0 and 4.");
        }
    }

    public static double getNumber(Scanner input, String prompt) {
        double number;
        while (true) {
            System.out.print(prompt);
            if (input.hasNextDouble()) {
                number = input.nextDouble();
                return number;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                input.next(); // Clear invalid input
            }
        }
    }

    public static double calculateResult(double num1, double num2, int operation) {
        switch (operation) {
            case 1: return num1 + num2; // Addition
            case 2: return num1 - num2; // Subtraction
            case 3: return num1 * num2; // Multiplication
            case 4: return num1 / num2; // Division
            default: return 0; // Should never reach here
        }
    }

    public static void displayResult(double result) {
        System.out.printf("Result: %.2f\n", result);
    }
}