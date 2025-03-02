package MethodLesson;

public class ArrayParametre {
    public static void sumOfIntegerArray(int [] array){
        int sum = 0;
        for (int a: array){
            sum+=a;
        }
    }

    public static void main(String [] args){
        sumOfIntegerArray(new int[]{3,2,1});
    }
}
