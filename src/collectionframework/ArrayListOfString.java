package collectionframework;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListOfString {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<>();
        System.out.print("Insert number of name: ");
        int n = new Scanner(System.in).nextInt();
        for(int i=0;i<n;i++){
            System.out.print("Insert name [" + (i+1) + "]: ");
            String name = new Scanner(System.in).nextLine();
            // add name to arraylist
            names.add(name);
        }
        System.out.println("========>>NAME LIST<<=========");
        names.forEach(e-> System.out.println("Name: " + e));
        // start update
        System.out.print("Insert old name to update: ");
        String  Name = new Scanner(System.in).nextLine();
        int index = names.indexOf(names);
        names.forEach(System.out::println);
        if(index>=0){
            System.out.print("Insert new name: ");
            String NewName = new Scanner(System.in).nextLine();
            // Update
            names.set(index, NewName);
            names.forEach(e-> System.out.println("Name: " + e));
        }else {
            System.out.println("Name is not found...!");
        }

        //System.out.print("Insert name to delete: ");
        //String name = new Scanner(System.in).nextLine();
        //if(index>=0){
            //names.remove(index);
           // System.out.println("Remove name " + name + " successfully");
            //names.forEach(System.out::println);
        //}else {
            //System.out.println("Name is not found...!");
        //}
    }
}
