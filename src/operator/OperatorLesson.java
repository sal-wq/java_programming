package operator;

import java.util.Scanner;

public class OperatorLesson {
    public static void main(String[] args){
        System.out.print("Insert your age: ");
        int age = new Scanner(System.in).nextInt();
        if(age>18){
            System.out.print("You're able to vote!");
        }else if(age<18){
            System.out.print("You're not able to vote!");
        }
    }
}
