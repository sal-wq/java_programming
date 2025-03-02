package ControlFlow;

import javax.swing.JOptionPane;

public class Switch1 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "============= Welcome to my Mart ==============\n" +
                "1. List all Products\n" +
                "2. Add new Product\n" +
                "3. Search Products by code\n" +
                "4. Delete Products\n" +
                "=========================================");

        while (true) { // Loop until valid input is entered
            String input = JOptionPane.showInputDialog("[1,2,3,4] Insert Option: ");

            try {
                int option = Integer.parseInt(input);

                switch (option) {
                    case 1 -> JOptionPane.showMessageDialog(null, "List all Products");
                    case 2 -> JOptionPane.showMessageDialog(null, "Add new Product");
                    case 3 -> JOptionPane.showMessageDialog(null, "Search Products by code");
                    case 4 -> JOptionPane.showMessageDialog(null, "Delete Products");
                    default -> {
                        JOptionPane.showMessageDialog(null, "Invalid Option. Please enter a number between 1 and 4.");
                        continue; // Restart loop
                    }
                }
                break; // Exit loop after valid input
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input! Please enter a number.");
            }
        }
    }
}
