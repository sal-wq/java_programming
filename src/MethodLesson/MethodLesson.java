package MethodLesson;

public class MethodLesson {
    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int ...numbers){
        int sum = 0;
        for(int a: numbers){
            sum = sum + a;
        }
        return sum;
    }
    public static void main(String[] args) {
        int resultOfSum = sum(5,9);
        int newSum = sum(4,8,5,9,4); // ... call Vararg
        System.out.println("Sum = " + resultOfSum);
        System.out.println("New Sum + " + newSum);
    }
}
