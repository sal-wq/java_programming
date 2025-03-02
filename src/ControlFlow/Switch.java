package ControlFlow;

import javax.swing.JOptionPane;

public class Switch {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("[1,2,3]Insert Option: ");

        try {
            int number = Integer.parseInt(input);

            switch (number) {
                case 1:
                    JOptionPane.showMessageDialog(null, "This is option 1");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "This is option 2");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "This is option 3");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "No option found");
                    break;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input! Please enter a number.");
        }
    }
}
