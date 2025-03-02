package MethodLesson;

public class MethodSum1 {
    public static int sum(int a,int b){
        return a+b;
    }
    public static double sum(double a,double b){
        return a+b;
    }
    public static float sum(float a,float b){
        return a+b;
    }

    public static void main(String[] args){
        sum(4,7);
        sum(5.5,9.6);
        float a = 42.4f, b = 85.7f;
        sum(a,b);
    }
}
