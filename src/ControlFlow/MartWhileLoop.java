package ControlFlow;

import java.util.Scanner;

public class MartWhileLoop {
    public static void main(String[] args){
        while(true){
            System.out.print("=============Welcome to my Mart==============" + "\n1. List all Product" + "\n2. Add new Product" +
                    "\n3. Search Product" + "\n4. Delete Product" + "\n5. Exit" +
                    "\n===================================\n");

            System.out.print("[+] Insert any option: ");
            int n = new Scanner(System.in).nextInt();
            switch (n){
                case 1-> System.out.println("List all Product");
                case 2-> System.out.println("Add new Product");
                case 3-> System.out.println("Search Product");
                case 4-> System.out.println("Delete Product");
                default -> System.exit(0);
            }
            System.out.println("Press any key to continue: ");
            new Scanner(System.in).nextLine();
        }
    }
}
