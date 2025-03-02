package ControlFlow;

public class DoWhileContinue {
    public static void main(String[] args) throws InterruptedException{
        int number = 1;
        do{
            Thread.sleep(50);
            number++;
            if (number == 10){
                continue;
            }
            System.out.println("Value of number: " + number);
            if (number == 20){
                break;
            }
        }while (number > 0);
    }
}
