package ArrayLesson;

import java.util.Arrays;
import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        System.out.println("==> All Numbers");
        Integer [] Numbers = {1,2,3,4};
        System.out.println(Arrays.toString(Numbers));
        System.out.print("[+] Insert any elemnt to delete: ");
        int deleteNumber = new Scanner(System.in).nextInt();
        for(int i=0;i<Numbers.length;i++){
            if(Numbers[i] == deleteNumber){
                Numbers[i] = null;
            }
        }
        System.out.println("===> All elements after deleted");
        for(Integer number: Numbers){
            if(number!=null){
                System.out.println(number);
            }
        }
    }
}
