package src;
import javax.swing.*;
import java.awt.*;

public class CombinedLayoutManagerExample extends JFrame {

    private static final long serialVersionUID = 1L;

	public CombinedLayoutManagerExample() {
        setTitle("Combined Layout Manager Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300);

        // Create tabs
        JTabbedPane tabbedPane = new JTabbedPane();

        // Add BorderLayout Example
        JPanel borderLayoutPanel = createBorderLayoutExample();
        tabbedPane.addTab("BorderLayout", borderLayoutPanel);

        // Add GridLayout Example
        JPanel gridLayoutPanel = createGridLayoutExample();
        tabbedPane.addTab("GridLayout", gridLayoutPanel);

        // Add tabs to the frame
        add(tabbedPane);

        // Set frame properties
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private JPanel createBorderLayoutExample() {
        // Components
        JLabel label = new JLabel("Label:");
        JTextField textField = new JTextField();

        JRadioButton maleRadio = new JRadioButton("Male");
        JRadioButton femaleRadio = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);

        JCheckBox programmingCheckbox = new JCheckBox("Programming Languages");

        JButton button = new JButton("Submit");

        // Panels
        JPanel inputPanel = new JPanel(new GridLayout(2, 2, 10, 10));
        inputPanel.add(label);
        inputPanel.add(textField);
        inputPanel.add(maleRadio);
        inputPanel.add(femaleRadio);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(inputPanel, BorderLayout.CENTER);
        mainPanel.add(programmingCheckbox, BorderLayout.SOUTH);
        mainPanel.add(button, BorderLayout.EAST);

        return mainPanel;
    }

    private JPanel createGridLayoutExample() {
        // Components
        JLabel label = new JLabel("Label:");
        JTextField textField = new JTextField();

        JRadioButton maleRadio = new JRadioButton("Male");
        JRadioButton femaleRadio = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);

        JCheckBox programmingCheckbox = new JCheckBox("Programming Languages");

        JButton button = new JButton("Submit");

        // Panels
        JPanel inputPanel = new JPanel(new GridLayout(2, 2, 10, 10));
        inputPanel.add(label);
        inputPanel.add(textField);
        inputPanel.add(maleRadio);
        inputPanel.add(femaleRadio);

        JPanel mainPanel = new JPanel(new GridLayout(3, 1, 10, 10));
        mainPanel.add(inputPanel);
        mainPanel.add(programmingCheckbox);
        mainPanel.add(button);

        return mainPanel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CombinedLayoutManagerExample::new);
    }
}
