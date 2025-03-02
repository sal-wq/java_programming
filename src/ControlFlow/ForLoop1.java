package ControlFlow;

public class ForLoop1 {
    public static void main(String[] args) {
        for(int i = 0;i<50;i++){
            try{
                Thread.sleep(500);
                System.out.println("B sl O");
            }catch (Exception ignore){}
        }
    }
}
