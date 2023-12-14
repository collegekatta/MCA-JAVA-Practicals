package src;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SBICustomerInformationForm extends JFrame {
    private static final long serialVersionUID = 1L;
	private JLabel lblTitle, lblName, lblAccountType, lblAddress, lblMobileNo, lblAccountNumber, lblBankName;
    private JTextField tfName, tfAddress, tfMobileNo, tfAccountNumber, tfBankName;
    private JComboBox<String> cbAccountType;
    private JButton btnSave;

    public SBICustomerInformationForm() {
        setTitle("SBI Bank Customer Information Form");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame

        // Title Label
        lblTitle = new JLabel("Customer Information");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 18));

        // Labels
        lblName = new JLabel("Name:");
        lblAccountType = new JLabel("Account Type:");
        lblAddress = new JLabel("Address:");
        lblMobileNo = new JLabel("Mobile No:");
        lblAccountNumber = new JLabel("Account Number:");
        lblBankName = new JLabel("Bank Name:");

        // TextFields
        tfName = new JTextField();
        tfAddress = new JTextField();
        tfMobileNo = new JTextField();
        tfAccountNumber = new JTextField();
        tfBankName = new JTextField();

        // ComboBox for Account Type
        String[] accountTypes = {"Savings", "Current", "Fixed Deposit"};
        cbAccountType = new JComboBox<>(accountTypes);

        // Button
        btnSave = new JButton("Save");

        // Layout
        JPanel panel = new JPanel(new GridLayout(7, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel.add(lblTitle);
        panel.add(new JLabel()); // Empty label for spacing
        panel.add(lblName);
        panel.add(tfName);
        panel.add(lblAccountType);
        panel.add(cbAccountType);
        panel.add(lblAddress);
        panel.add(tfAddress);
        panel.add(lblMobileNo);
        panel.add(tfMobileNo);
        panel.add(lblAccountNumber);
        panel.add(tfAccountNumber);
        panel.add(lblBankName);
        panel.add(tfBankName);

        // Adding components to the frame
        add(panel, BorderLayout.CENTER);
        add(btnSave, BorderLayout.SOUTH);

        // Button actions
        btnSave.addActionListener(e -> saveCustomerInformation());

        // Set frame properties
        setResizable(false);
        setVisible(true);
    }

    private void saveCustomerInformation() {
        // Implement the logic for saving customer information
        String name = tfName.getText();
        String accountType = (String) cbAccountType.getSelectedItem();
        String address = tfAddress.getText();
        String mobileNo = tfMobileNo.getText();
        String accountNumber = tfAccountNumber.getText();
        String bankName = tfBankName.getText();

        // Print or save the customer information (you can modify this part)
        System.out.println("Customer Information:");
        System.out.println("Name: " + name);
        System.out.println("Account Type: " + accountType);
        System.out.println("Address: " + address);
        System.out.println("Mobile No: " + mobileNo);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Bank Name: " + bankName);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SBICustomerInformationForm());
    }
}
