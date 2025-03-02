package variable;

class User{
    public int id;
    public String name;
    public String email;
}
enum Status{
    FAILED,
    SUCCESS
}
public class VariableLesson {
    public static void main(String[] args) {
        Status status = Status.SUCCESS;
        System.out.println(status);
        User user = new User();
        user.id = 12;
        user.name="visal";
        user.email="visal@gmail.com";
        System.out.println(user.email);
    }
}
