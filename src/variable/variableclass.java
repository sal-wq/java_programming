package variable;

import java.util.Scanner;

public class variableclass {
    public static void main(String[] args){
        System.out.print("[+] Insert student's name: ");
        Scanner scanner = new
                Scanner(System.in);
        String studentName = scanner.nextLine();
        System.out.print("[+] Insert Math score: ");
        Double mathScore = scanner.nextDouble();
        System.out.print("[+] Insert Khmer score: ");
        Double khmerScore = scanner.nextDouble();
        System.out.print("[+] Insert English score: ");
        Double englishScore = scanner.nextDouble();
        //
        Double avg = (mathScore+khmerScore+englishScore)/3;
        System.out.println("=".repeat(25));
        System.out.println("Student's name: " +studentName);
        System.out.println("Student average: " +avg);
    }
}
