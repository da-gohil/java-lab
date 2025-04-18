import javax.swing.*;

public class HelloJavaGUI {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("Welcome Danny");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400); // Set the size of the frame

        // Center the frame on the screen
        frame.setLocationRelativeTo(null);

        // Create a JLabel with a larger font
        JLabel label = new JLabel("Hello! from Virtual World to Real World", SwingConstants.CENTER);

        // Add the label to the frame
        frame.getContentPane().add(label);

        // Make the frame visible
        frame.setVisible(true);
    }
}