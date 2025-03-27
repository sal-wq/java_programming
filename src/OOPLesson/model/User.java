package OOPLesson.model;

import lombok.*;
// @Data // all setter and getter
@Getter
@Setter
public class User{
    private int id;
    private String name;
    private String email;
    private String password;
    private String profile;
}
