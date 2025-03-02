package ControlFlow;

public class DoWhileLoop {
    public static void main(String[] args) throws InterruptedException{
        char character = 'A';
        do{
            Thread.sleep(40);
            System.out.println("i value [ " + character + " ]");
            character++;
            if(character > 'Z'){
                break;
            }
        }while (character != 'Z');
    }
}
