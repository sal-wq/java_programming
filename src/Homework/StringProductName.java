package Homework;

import java.util.ArrayList;
import java.util.Scanner;

public class StringProductName {
    private ArrayList<String> products;
    private Scanner scanner;

    public StringProductName() {
        products = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void addProduct() {
        System.out.print("Insert product name to add: ");
        String productName = scanner.nextLine();
        products.add(productName);
        System.out.println("Product added: " + productName);
    }

    public void searchProduct() {
        System.out.print("Insert product name to search: ");
        String productName = scanner.nextLine();
        if (products.contains(productName)) {
            System.out.println("Product found: " + productName);
        } else {
            System.out.println("Product not found.");
        }
    }

    public void updateProduct() {
        System.out.print("Insert product name to update: ");
        String oldName = scanner.nextLine();
        if (products.contains(oldName)) {
            System.out.print("Insert new product name: ");
            String newName = scanner.nextLine();
            products.set(products.indexOf(oldName), newName);
            System.out.println("Product updated to: " + newName);
        } else {
            System.out.println("Product not found.");
        }
    }

    public void deleteProduct() {
        System.out.print("Insert product to delete: ");
        String productName = scanner.nextLine();
        if (products.remove(productName)) {
            System.out.println("Product deleted: " + productName);
        } else {
            System.out.println("Product not found.");
        }
    }

    public void displayMenu() {
        System.out.println("==========>>PRODUCT LIST<<==========");
        System.out.print("""
                1. Add New Product by name
                2. Search product name by name
                3. Update product name
                4. Delete product name
                5. Exit
                Choose an option:
                """);

    }

    public void process() {
        while (true) {
            displayMenu();
            int choice;
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine();
            } else {
                scanner.nextLine();
                System.out.println("Invalid input! Please enter a number.");
                continue;
            }

            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    searchProduct();
                    break;
                case 3:
                    updateProduct();
                    break;
                case 4:
                    deleteProduct();
                    break;
                case 5:
                    System.out.println("Exiting!");
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    public static void main(String[] args) {
        StringProductName spn = new StringProductName();
        spn.process();
    }
}