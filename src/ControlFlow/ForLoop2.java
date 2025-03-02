package ControlFlow;

import java.util.Scanner;

public class ForLoop2 {
    public static void main(String[] args) throws InterruptedException{
        System.out.print("Insert number of loop: ");
        int a = new Scanner(System.in).nextInt();
        for(int i=0; i<a; i++){
            System.out.println("My name [ " + (i + 1) + "]");
            Thread.sleep(200);
        }
    }
}
