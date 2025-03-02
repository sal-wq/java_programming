package ArrayLesson;

import java.time.Instant;
import java.util.Date;
import java.util.Scanner;

public class ArrayProductExercise {
    public static void main(String[] args){
        System.out.println("=".repeat(24));
        System.out.println("Product Stock management");
        System.out.println("=".repeat(24));
        String [] Pname = new String[30];
        while(true){
            System.out.println("""
                    | 1. List all Products |
                    | 2. Create new Product|
                    | 3. Update Product    |
                    | 4. Delete            |
                    | 5. Exit              |
                    |______________________|
                    """);
            System.out.print("[+] Insert any option: ");
            int opt = new Scanner(System.in).nextInt();
            switch (opt){
                case 1-> {
                    System.out.println("==> List of Products");
                    for(String p: Pname){
                        if(p!=null){
                            System.out.println(p);
                        }
                    }
                }
                case 2-> {
                    System.out.print("Insert Product Name: ");
                    String productN = new Scanner(System.in).nextLine();
                    for(int i=0;i<Pname.length;i++){
                        if(Pname[i] == null){
                            Pname[i] = productN;
                            break;
                        }
                    }
                    System.out.println("Product has been added successfully");
                    System.out.println("Created at" + Date.from(Instant.now()));
                }
                case 3-> {
                    System.out.print("Insert Product Name to update: ");
                    String oldName = new Scanner(System.in).nextLine();
                    for(int i=0;i<Pname.length;i++){
                        if(Pname[i]!=null && Pname[i].equals(oldName)){
                            System.out.print("Insert new Product Name: ");
                            String newName = new Scanner(System.in).nextLine();
                            Pname[i] = newName;
                        }
                    }
                    System.out.println("Product has been updated successfully");
                    System.out.println("Updated at" + Date.from(Instant.now()));
                }
                case 4-> {
                    System.out.print("Insert any Product Name to delete: ");
                    String deleteName = new Scanner(System.in).nextLine();
                    for(int i=0;i<Pname.length;i++){
                        if(Pname[i]!=null && Pname[i].equals(deleteName)){
                            Pname[i] = null;
                        }
                    }
                    System.out.println("Product has been deleted successfully");
                    System.out.println("Deleted at" + Date.from(Instant.now()));
                }
                case 5-> {
                    System.out.println("Good luck");
                    System.exit(0);
                }
            }
            System.out.println("==>> Press any key to continue...");
            new Scanner(System.in).nextLine();
        }
    }
}
