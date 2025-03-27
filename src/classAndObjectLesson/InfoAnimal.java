package classAndObjectLesson;

import java.util.Random;

class Animal{
    private int id;
    private String name;
    private String color;
    private String gender;

    public Animal(){}

    public Animal(int id, String name, String color, String gender) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}

public class InfoAnimal {
    public static void main(String[] args) {
        int a = new Random(9999).nextInt();
        Animal duck = new Animal(10,"Xiaopao","White","M");
        System.out.println(duck);
        Animal chicken = new Animal();
        chicken.setId(12);
        chicken.setName("Lulu");
        chicken.setColor("Brown");
        chicken.setGender("F");
        System.out.println(chicken);
    }
}
