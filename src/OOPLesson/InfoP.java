package OOPLesson;

class Parent{
    protected Integer id;
    protected String name;
    protected Integer age;
    //
    public Parent (){}

    public Parent(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
class Son extends Parent{
    public String creditCard;
}

public class InfoP {
    public static void main(String[] args) {
        Parent son = new Son();
        son.id = 12;
        System.out.println("Son ID: " + son.id);
        Son s = new Son();
        s.creditCard = "2343-7493";
        System.out.println("Son Credit Card: " + s.creditCard);
    }
}
