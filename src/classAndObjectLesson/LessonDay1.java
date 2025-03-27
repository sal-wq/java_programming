package classAndObjectLesson;

class User{
    public Integer id;
    public String email;
    public String userName;
    void setUserInfo(Integer id, String email, String userName){
        this.id = id;
        this.email = email;
        this.userName = userName;
    }
    void Output(){
        System.out.println("User ID :" + id + "\tUser Email: " + email+  "\tUser Name: "+ userName+'\n');
    }
    void multiply(int a, int b){
        System.out.println("Result of multiply:");
    }
}

public class LessonDay1 {
    public static void main(String[] args) {
        User user1 = new User();
        user1.id=1;
        user1.userName = "Visal";
        user1.email = "visalkean8@gmail.com";
        User user2 =  new User();
        user2.id=2;
        user2.userName = "Khemrak";
        user2.email="khemrak10@gmail.com";
        user1.Output();
        user2.Output();
    }
}
