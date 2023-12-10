import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SbiBankCustomerForm extends JFrame {

    private JTextField tfAccountNumber, tfCustomerName, tfBalance;
    private JButton btnSave, btnUpdate, btnDelete;

    public SbiBankCustomerForm() {
        setTitle("SBI Bank Customer Information Form");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initializeComponents();

        setLayout(new GridLayout(4, 2));
        add(new JLabel("Account Number:"));
        add(tfAccountNumber);
        add(new JLabel("Customer Name:"));
        add(tfCustomerName);
        add(new JLabel("Balance:"));
        add(tfBalance);
        add(btnSave);
        add(btnUpdate);
        add(btnDelete);

        addActionListeners();

        setVisible(true);
    }

    private void initializeComponents() {
        tfAccountNumber = new JTextField();
        tfCustomerName = new JTextField();
        tfBalance = new JTextField();
        btnSave = new JButton("Save");
        btnUpdate = new JButton("Update");
        btnDelete = new JButton("Delete");
    }

    private void addActionListeners() {
        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveCustomerInformation();
            }
        });

        btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateCustomerInformation();
            }
        });

        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteCustomerInformation();
            }
        });
    }

    private void saveCustomerInformation() {
        // Implement the logic for saving customer information
        String accountNumber = tfAccountNumber.getText();
        String customerName = tfCustomerName.getText();
        String balance = tfBalance.getText();

        // Perform necessary operations with the collected information (e.g., save to a database)
        System.out.println("Saving customer information - Account Number: " + accountNumber +
                ", Customer Name: " + customerName + ", Balance: " + balance);
    }

    private void updateCustomerInformation() {
        // Implement the logic for updating customer information
        String accountNumber = tfAccountNumber.getText();
        String customerName = tfCustomerName.getText();
        String balance = tfBalance.getText();

        // Perform necessary operations with the collected information (e.g., update in a database)
        System.out.println("Updating customer information - Account Number: " + accountNumber +
                ", Customer Name: " + customerName + ", Balance: " + balance);
    }

    private void deleteCustomerInformation() {
        // Implement the logic for deleting customer information
        String accountNumber = tfAccountNumber.getText();

        // Perform necessary operations with the collected information (e.g., delete from a database)
        System.out.println("Deleting customer information - Account Number: " + accountNumber);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SbiBankCustomerForm());
    }
}
