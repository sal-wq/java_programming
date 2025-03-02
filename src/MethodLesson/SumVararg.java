package MethodLesson;

public class SumVararg {
    public static void sum(int ...a){
        int sum = 0;
        for(int n: a){
            sum+=n;
        }
        System.out.println("Sum: " + sum);
    }

    public static void main(String[] args){
        sum();
        sum(1);
        sum(1,2);
        sum(1,2,3);
        sum(1,2,3,4);
        sum(1,2,3,4,5);
        sum(1,2,3,4,5,6);
    }
}
