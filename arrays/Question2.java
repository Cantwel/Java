import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Question2 extends JFrame implements ActionListener {

    private JTextField inputField;
    private JButton checkButton;
    private JLabel resultLabel;

    public Question2() {
        // Set up the GUI components
        setTitle("Palindrome Checker");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        inputField = new JTextField(10);
        checkButton = new JButton("Check");
        resultLabel = new JLabel("");

        JPanel panel = new JPanel();
        panel.add(new JLabel("Enter a number:"));
        panel.add(inputField);
        panel.add(checkButton);
        panel.add(resultLabel);

        // Add the panel to the frame
        add(panel);

        // Add an action listener to the button
        checkButton.addActionListener(this);

        // Display the GUI
        setVisible(true);
    }

    // This method will be called when the button is clicked
    public void actionPerformed(ActionEvent e) {
        String input = inputField.getText();
        int number = Integer.parseInt(input);

        // Call the isPalindrome method to check if the number is a palindrome
        if (isPalindrome(number)) {
            resultLabel.setText("The number is a palindrome.");
        } else {
            resultLabel.setText("The number is not a palindrome.");
        }
    }

    // This method checks if the given number is a palindrome
    private boolean isPalindrome(int number) {
        int reverse = 0;
        int original = number;

        // Reverse the number
        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number /= 10;
        }

        // Check if the original number is equal to the reversed number
        if (original == reverse) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        // Create an instance of the Question2 class
        Question2 gui = new Question2();
    }
}
