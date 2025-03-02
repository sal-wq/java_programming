package variable;

public class variablelesson1 {
    public static void main(String[] agrs){
        // promotion
        int avg = 2;
        double newAvg = avg;
        //casting
        double price = 55.5;
        int singlePrice = (int) price;
        // auto-boxing
        int primitive = 100;
        Integer newWrapper = primitive;
        // unboxing
        Double doubleOfWrapper = 45.5;
        double primitiveDouble = doubleOfWrapper;
    }
}
