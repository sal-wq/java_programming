package OOPLesson.MultiLevelInheritance;

class A{protected Integer id;}
class B extends A{}
class C extends B{}

public class Lesson {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        a.id = 1;
        b.id = 2;
        c.id = 3;
    }
}
