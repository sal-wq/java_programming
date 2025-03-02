package ControlFlow;

import java.util.Scanner;

public class ControlFlowJavaDay1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Insert Math score: ");
            int math = scanner.nextInt();
            System.out.print("Insert Khmer score: ");
            int khmer = scanner.nextInt();
            System.out.print("Insert English score: ");
            int english = scanner.nextInt();
            System.out.print("Insert Physics score: ");
            int physics = scanner.nextInt();
            double average = (double)(math + khmer + english + physics) / (double)4.0F;
            if (!(average > (double)90.0F) && (!(average <= (double)100.0F) || !(average > (double)90.0F))) {
                if (!(average > (double)80.0F) && (!(average <= (double)90.0F) || !(average > (double)80.0F))) {
                    if (!(average > (double)70.0F) && (!(average <= (double)80.0F) || !(average > (double)70.0F))) {
                        if (!(average > (double)60.0F) && (!(average <= (double)70.0F) || !(average > (double)60.0F))) {
                            if (!(average > (double)50.0F) && (!(average <= (double)60.0F) || !(average > (double)50.0F))) {
                                if (!(average >= (double)0.0F) && (!(average <= (double)50.0F) || !(average >= (double)0.0F))) {
                                    System.out.println("Invalid input! Please enter valid scores.");
                                } else {
                                    System.out.println("You're failed!");
                                    System.out.println("Please try again!");
                                }
                            } else {
                                System.out.println("You're in grade E!");
                            }
                        } else {
                            System.out.println("You're in grade D!");
                        }
                    } else {
                        System.out.println("You're in grade C!");
                    }
                } else {
                    System.out.println("You're in grade B!");
                }
            } else {
                System.out.println("You're in grade A!");
            }

            scanner.close();
        }
}