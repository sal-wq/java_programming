package ControlFlow;

import java.util.Locale;
import java.util.Scanner;

public class ForLoopName {
    public static void main(String[] args){
        System.out.print("Insert your name: ");
        String name = new Scanner(System.in).nextLine();
        name = name.toLowerCase(Locale.ENGLISH);
        if(name.equalsIgnoreCase("Visal")) {
            System.out.println(name + " has been allowed");
        }
    }
}
