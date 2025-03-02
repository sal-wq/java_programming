package Homework;

public class Number3 {
    public static void main(String[] args) {
        int rows = 5;
        int N = 1;
        for (int i = 1; i <= rows; i++){
            for (int j = 1; j <= rows - i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++){
                System.out.print(N + " ");
                N++;
            }
            System.out.println();
        }
    }
}
