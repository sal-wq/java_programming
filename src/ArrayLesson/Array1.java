package ArrayLesson;

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        String[]  names = new String[5];
        names[0] = "Visal";
        names[1] = "Roth";
        names[2] = "Pech";
        names[3] = "Darith";
        names[4] = "Chantra";
        //
        System.out.println(Arrays.toString(names));
        System.out.println("Arrays size ["+names.length+"]:");
        for(int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }
    }
}
