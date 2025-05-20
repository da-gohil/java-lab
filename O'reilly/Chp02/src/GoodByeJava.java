import javax.swing.*;

public class GoodByeJava {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exercise 01");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        // Create a JLabel and add it to the frame
        JLabel label = new JLabel("Goodbye Java - Chapter 02 Exercise 01", SwingConstants.CENTER);
        frame.add(label);
        frame.setVisible(true);
    }
}