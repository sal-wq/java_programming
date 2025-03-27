package OOPLesson.Polymorphism;

class Service{
    public int sum(int a, int b){
        System.out.println("[+] This is result of sum : " + (a+b));
        return a+b;
    }
}
class Service2 extends Service{
    public int sum(int a, int b){
        System.out.println("[+] This is result of sum2: " + (a+b));
        return a+b;
    }
}

public class Polymor {
    public static void main(String[] args) {
        Service service = new Service();
        service.sum(3,9);
        System.out.println("-".repeat(28));
        Service2 service2 = new Service2();
        service2.sum(10,8);
    }
}
