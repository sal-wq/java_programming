package MethodLesson;

public class Exercise {
    public static void FindDuplicate(int [] array) {
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i] == array[j]){
                    System.out.println("Found Duplicated: " + array[i]);
                }
            }
        }
    }

    public static void main(String [] args) {
           FindDuplicate(new int[]{20,10,20,100,200,200,50,80,50});
    }
}
