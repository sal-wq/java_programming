package MethodLesson;

import java.util.Scanner;

public class MethodSum {
    public static void sum(int a, int b) {
        System.out.println("Sum of a+b = " + (a+b));
    }
    public static void findMax(int a, int b){
        if(a<b){
            System.out.println(a + ">" + b);
        }else {
            System.out.println(a + "<" +b);
        }
    }

    public static void main(String[] args) {
         findMax(2,3);
         findMax(500,300);
    }
}
