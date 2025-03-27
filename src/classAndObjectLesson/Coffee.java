package classAndObjectLesson;

class Cafe{
    int icelatte;
    int capucino;

    @Override
    public String toString() {
        return "Cafe{" +
                "icelatte=" + icelatte +
                ", capucino=" + capucino +
                '}';
    }
}

public class Coffee {
    public static void main(String[] args) {
        Cafe cafe = new Cafe();
        cafe.capucino = 10;
        System.out.println(cafe.capucino);
        cafe.icelatte = 5;
        System.out.println(cafe.icelatte);
        System.out.println(cafe);
    }
}
