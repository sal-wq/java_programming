package MethodLesson;

import java.util.Arrays;

public class MethodLesson1 {
    // delimiter is break String
    private static String[] mySplit(String data,String delimiter){
        return data.split(delimiter);
    }

    public static void main(String[] args){
        // "Hello, Hi"
        String data = "Hello, World";
        String [] resultOfSplit = mySplit(data,",");
        System.out.println(Arrays.toString(resultOfSplit));
    }
}
