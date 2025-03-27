package OOPLesson;

import OOPLesson.model.User;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setId(12);
        user.setName("Visal");
        System.out.println(user.getId());
        System.out.println(user.getName());
    }
}
