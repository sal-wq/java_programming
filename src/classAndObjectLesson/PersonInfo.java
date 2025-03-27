package classAndObjectLesson;

class Book{
    private int id;
    private String title;
    // contructor
    public Book(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}

public class PersonInfo {
    public static void main(String[] args) {
        Book book = new Book();
        book.setId(8);
        book.setTitle("Kikilu");
        //System.out.println("ID: " + book.getId());
        System.out.println(book); // show all output
    }
}
