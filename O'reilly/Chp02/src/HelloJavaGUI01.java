import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HelloJavaGUI01 {
    /**
     * An upgraded graphical application with interactivity!
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Welcome Danny 01");
        frame.add(new HelloComponent2("Hello! from Virtual World to Real World"));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setVisible(true); // Set visibility after adding components
    }
}

/*
 * Inheritance (the "extends" keyword below) and interfaces
 * (the "implements MouseMotionListener" portion) are covered in
 * more detail in Chapter 5.
 */
class HelloComponent2 extends JComponent implements MouseMotionListener {
    String theMessage;
    int messageX = 125, messageY = 95; // Coordinates of the message

    /**
     * Create a new component that can draw its message at an arbitrary position.
     * That position can be changed by dragging the mouse; we attach a listener
     * to pick up those drag events.
     */
    public HelloComponent2(String message) {
        theMessage = message;
        addMouseMotionListener(this);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // Call the superclass method to ensure proper painting
        g.drawString(theMessage, messageX, messageY);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // Save the mouse coordinates and paint the message.
        messageX = e.getX();
        messageY = e.getY();
        repaint(); // Request a repaint to update the display
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // Ignore simple movements
    }
}