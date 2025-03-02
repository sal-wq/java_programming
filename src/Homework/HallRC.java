package Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HallRC {
    static String[][] hall;
    static List<String> bookingHistory = new ArrayList<>();
    static int rowNumber;
    static int columnNumber;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("=== Hall Booking System ===");
            System.out.println("1. Set up hall");
            System.out.println("2. Start booking");
            System.out.println("3. Cancel booked seat");
            System.out.println("4. View History");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    setupHall(scanner);
                    break;
                case 2:
                    startBooking(scanner);
                    break;
                case 3:
                    cancelBooking(scanner);
                    break;
                case 4:
                    viewHistory();
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }

    private static void setupHall(Scanner scanner) {
        System.out.print("[+] Insert number of rows: ");
        rowNumber = scanner.nextInt();
        System.out.print("[+] Insert number of columns: ");
        columnNumber = scanner.nextInt();
        hall = new String[rowNumber][columnNumber];

        char characterSeat = 'A';
        int seatCode;

        for (int i = 0; i < hall.length; i++) {
            seatCode = 1;
            for (int j = 0; j < hall[i].length; j++) {
                hall[i][j] = characterSeat + "-" + seatCode + " :AV";
                seatCode++;
            }
            characterSeat++;
        }
        System.out.println("Hall setup completed.");
    }

    private static void startBooking(Scanner scanner) {
        while (true) {
            // Show hall
            displayHall();

            System.out.print("[+] Insert seat code to book (e.g., A-1) or type 'back' to return: ");
            String code = scanner.nextLine().trim();

            if (code.equalsIgnoreCase("back")) {
                break;
            }

            boolean isFoundSeat = false;
            for (int i = 0; i < hall.length; i++) {
                for (int j = 0; j < hall[i].length; j++) {
                    String[] splitCode = hall[i][j].split(":");
                    if (splitCode[0].trim().equalsIgnoreCase(code)) {
                        isFoundSeat = true;
                        if (splitCode[1].trim().equals("BO")) {
                            System.out.println("This seat has already been booked!");
                            return;
                        }
                        hall[i][j] = splitCode[0] + " :BO";
                        bookingHistory.add("Booked: " + splitCode[0]);
                        System.out.println("Seat successfully booked!");
                    }
                }
            }
            if (!isFoundSeat) {
                System.out.println("Seat not found! Please try again.");
            }

            System.out.println(">> Press any key to continue...");
            scanner.nextLine();
        }
    }

    private static void cancelBooking(Scanner scanner) {
        System.out.print("[+] Insert seat code to cancel booking (e.g., A-1): ");
        String code = scanner.nextLine().trim();
        boolean isFoundSeat = false;

        for (int i = 0; i < hall.length; i++) {
            for (int j = 0; j < hall[i].length; j++) {
                String[] splitCode = hall[i][j].split(":");
                if (splitCode[0].trim().equalsIgnoreCase(code) && splitCode[1].trim().equals("BO")) {
                    hall[i][j] = splitCode[0] + " :AV"; // Mark seat as available
                    bookingHistory.add("Cancelled: " + splitCode[0]);
                    System.out.println("Booking cancelled for seat: " + splitCode[0]);
                    isFoundSeat = true;
                }
            }
        }
        if (!isFoundSeat) {
            System.out.println("Seat not found or was not booked!");
        }
    }

    private static void viewHistory() {
        System.out.println("=== Booking History ===");
        for(int i=0;i< hall.length;i++){
            for(int j=0;j<hall[i].length;j++){
                System.out.print("|"+hall[i][j]+"|   ");
            }
            System.out.println();
        }
    }

    private static void displayHall() {
        System.out.println("=== Current Hall Status ===");
        for (int i = 0; i < hall.length; i++) {
            for (int j = 0; j < hall[i].length; j++) {
                if (j == 0) {
                    System.out.print("| ");
                }
                System.out.print(hall[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
