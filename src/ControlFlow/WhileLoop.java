package ControlFlow;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) throws InterruptedException{
        int i = 0;
        while(i<5){
            System.out.println("Hello [" + (i+1) + "]");
            Thread.sleep(200);
        }
    }
}
