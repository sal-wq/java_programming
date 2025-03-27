package OOPLesson;

// Person class is called a base, parent, or super class.
// Teacher and Student class are called  subclass, derived class or child class.

class Person{
    int id;
    String email;
    String name;
}

class Teacher extends Person{
    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
class Student extends Person{
    String studentCardNumber;
    @Override
    public String toString() {
        return "Student{" +
                "studentCardNumber='" + studentCardNumber + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}


public class Inheritance {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.id = 25;
        teacher.email = "Pheng123@gmail.com";
        teacher.name = "Pheng";
        Student student = new Student();
        System.out.println(teacher);
        student.name = "Visal";
        student.id = 31;
        student.email = "visal88@gmail.com";
        student.studentCardNumber = "B-08672";
        System.out.println(student);
    }
}
