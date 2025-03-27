package OOPLesson;

class Family {
    protected String name;
    protected String age;
    //
    public Family(){}
    public Family(String name){
        this.name = name;
    }
    public void run(){
        System.out.println(name + " is running");
    }
}
class male extends Family{
    public male(String name){
        super(name);
    }
}
public class InheritanceSuper {
    public static void main(String[] args) {
        Family m = new male("Weisha");
        m.run();
    }
}
