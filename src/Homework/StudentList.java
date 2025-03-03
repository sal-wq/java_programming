package Homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class StudentList {
    private static Map<Integer, String> studentInfo = new HashMap<>();
    private static Boolean addNewStudentName(String studentName){
        int key = new Random().nextInt(999999);
        studentInfo.put(key, studentName);
        return true;
    }
    private static boolean removeStudentById(int id){
        String value = studentInfo.remove(id);
        if(value!=null){
            return true;
        }
        return false;
    }
    private static boolean updateStudentById(int id, String newName){
        String value = studentInfo.put(id, newName);
        if (value != null) {
            return true;
        }
        return false;
    }

    public static boolean searchStudentById(int id){
        String value = studentInfo.get(id);
        if(value != null){
            return true;
        }
        System.out.println(value);
        return false;
    }
    public static void home() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("""
                1. Add student name
                2. Search by ID
                3. Delete student by ID
                4. Update student by ID
                5. Exit
                """);
            System.out.print("Insert option: ");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1 -> {
                    System.out.print("Insert Number of students: ");
                    int n = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 0; i < n; i++) {
                        System.out.println(" Student Record ");
                        System.out.print("Insert student name to add to record: ");
                        String name = scanner.nextLine();
                        boolean isInserted = addNewStudentName(name);
                    }
                    System.out.println(studentInfo);
                }
                case 2 -> {
                    System.out.print("Insert student ID to search: ");
                    int id = scanner.nextInt();
                    boolean isFound = searchStudentById(id);
                    if (isFound) {
                        System.out.println("Student ID " + id + " found: " + studentInfo.get(id));
                    } else {
                        System.out.println("ID not found.");
                    }
                }
                case 3 -> {
                    System.out.print("Insert ID to delete: ");
                    int remove = scanner.nextInt();
                    boolean delete = removeStudentById(remove);
                    if (delete) {
                        System.out.println("ID deleted: " + remove);
                    } else {
                        System.out.println("ID not found.");
                    }
                    System.out.println(studentInfo);
                }
                case 4 -> {
                    System.out.print("Insert ID to update: ");
                    int idToUpdate = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Insert new student name: ");
                    String newName = scanner.nextLine();
                    boolean updated = updateStudentById(idToUpdate, newName);
                    if (updated) {
                        System.out.println("Student updated successfully.");
                    } else {
                        System.out.println("Student ID not found.");
                    }
                    System.out.println(studentInfo);
                }
                case 5 -> {
                    System.out.println("谢谢🙏🏻");
                    System.exit(0);
                }
                default -> {
                    System.out.println("Invalid option! Please try again.");
                }
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(studentInfo);
        home();
    }
}