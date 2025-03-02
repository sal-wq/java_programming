package ControlFlow;

public class ForLoop2times {
    public static void main(String[] args) {
        myLabel:
        for (int i = 0; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (j % 2 == 0) {
                    System.out.println();
                    break myLabel;
                }
                System.out.println(i + "=><=" + j);
            }
        }
    }
}