package ArrayLesson;

import java.util.Arrays;

public class ArrayDay2 {
    public static void main(String[] args) {
        int [] num = {-100,-700,-800,500,300,100};
        System.out.println(Arrays.toString(num));
        // Array.sort(num);
        // If we want to reverse write like this:
        // List<Integer> integerList = new ArrayList<>();
        // Array.stream(num).forEach(e->{integerList.add(e));
        // Collections.reverse();
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num.length-1;j++){
                if(num[j]<num[j+1]){
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }
        System.out.println("=============>>SORT<<============");
        System.out.println(Arrays.toString(num));
    }
}
