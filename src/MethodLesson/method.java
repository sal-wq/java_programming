package MethodLesson;

public class method {
    public static void thumbnail() {
        System.out.println("=======================");
        System.out.println(" Welcome to Khmer Mart");
        System.out.println("=======================");
        System.out.println("""
                1. List all Products
                2. Insert new Product
                3. Update Product
                4. Delete Product
                5. Exit
                """);
    }
    public static void main(String[] args) {
          thumbnail(); // call method
    }
}
