package ArrayLesson;

import java.util.Scanner;
import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        System.out.print("Insert number of elements: ");
        int number = new Scanner(System.in).nextInt();
        String [] names = new String[number];
        for(int i=0;i<number;i++){
            System.out.println("[+] Insert name [ " + i + " ]: ");
            names[i] = new Scanner(System.in).nextLine();
        }
        System.out.println("====> All names");
        System.out.println(Arrays.toString(names));
        // Update new name
        System.out.println("[+] Insert old name to update: ");
        String oldName = new Scanner(System.in).nextLine();
        for(int i=0;i<number;i++){
            if(oldName.equals(names[i])){
                System.out.println("[+] Insert new name: ");
                String newName = new Scanner(System.in).nextLine();
                names[i] = newName;
            }
        }
        System.out.println("==> All updated names");
        System.out.println(Arrays.toString(names));
    }
}
