package ControlFlow;

import java.util.Scanner;

public class LoopEvenOdd {
    public static void main(String[] args) {
        System.out.print("[+] Insert number: ");
        int n = new Scanner(System.in).nextInt();
        int numberOfEven = 0;
        int numberOfOdd = 0;
        for(int i=1; i<=n; i++){
            if(i%2 == 0){
                numberOfEven++;
            }else {
                numberOfOdd++;
            }
        }
        System.out.println("Even: " + numberOfEven + "\nOdd: " + numberOfOdd);
    }
}
