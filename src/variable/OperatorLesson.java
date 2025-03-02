package variable;

import java.util.Scanner;

public class OperatorLesson {
    public static void main(String[] args){
        // relationship operator or comparison operator
        System.out.print("[+] Insert a: ");
        int a = new Scanner(System.in).nextInt();
        System.out.print("[+] Insert b: ");
        int b = new Scanner(System.in).nextInt();
        System.out.println("A > B: " + (a > b));
        System.out.println("A > B: " + (a < b));
        System.out.println("A > B: " + (a >= b));
        System.out.println("A > B: " + (a <= b));
        System.out.println("A > B: " + (a != b));
        System.out.println("A == B: " + (a == b));
        System.out.println("Using AND Operator: " + ((a > b) && (a < b)));
        System.out.println("Using AND Operator: " + ((a > b) || (a < b)));
    }
}

