import javax.swing.*;
import java.awt.*;

public class LayoutManagerExample extends JFrame {

    public LayoutManagerExample() {
        // Set the layout manager for the JFrame
        setLayout(new FlowLayout()); // FlowLayout

        // Creating buttons for FlowLayout
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");

        // Adding buttons to the JFrame
        add(button1);
        add(button2);
        add(button3);

        // Creating buttons for GridLayout
        JButton button4 = new JButton("Button 4");
        JButton button5 = new JButton("Button 5");
        JButton button6 = new JButton("Button 6");

        // Creating a panel with GridLayout
        JPanel gridPanel = new JPanel(new GridLayout(2, 2)); // 2 rows, 2 columns

        // Adding buttons to the GridLayout panel
        gridPanel.add(button4);
        gridPanel.add(button5);
        gridPanel.add(button6);

        // Adding the GridLayout panel to the JFrame
        add(gridPanel);

        // Set JFrame properties
        setTitle("Layout Manager Example");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame
        setVisible(true);
    }

    public static void main(String[] args) {
        // Create an instance of the LayoutManagerExample class
        SwingUtilities.invokeLater(() -> new LayoutManagerExample());
    }
}
