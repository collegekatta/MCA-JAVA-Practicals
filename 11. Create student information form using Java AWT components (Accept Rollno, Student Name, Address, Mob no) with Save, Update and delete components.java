import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentInformationForm extends Frame {
    private Label lblRollNo, lblName, lblAddress, lblMobNo;
    private TextField tfRollNo, tfName, tfAddress, tfMobNo;
    private Button btnSave, btnUpdate, btnDelete;

    public StudentInformationForm() {
        setTitle("Student Information Form");
        setSize(400, 300);
        setLayout(new GridLayout(5, 2));
        setLocationRelativeTo(null); // Center the frame
        setResizable(false);

        // Labels
        lblRollNo = new Label("Roll No:");
        lblName = new Label("Student Name:");
        lblAddress = new Label("Address:");
        lblMobNo = new Label("Mobile No:");

        // TextFields
        tfRollNo = new TextField();
        tfName = new TextField();
        tfAddress = new TextField();
        tfMobNo = new TextField();

        // Buttons
        btnSave = new Button("Save");
        btnUpdate = new Button("Update");
        btnDelete = new Button("Delete");

        // Adding components to the frame
        add(lblRollNo);
        add(tfRollNo);
        add(lblName);
        add(tfName);
        add(lblAddress);
        add(tfAddress);
        add(lblMobNo);
        add(tfMobNo);
        add(btnSave);
        add(btnUpdate);
        add(btnDelete);

        // Button actions
        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveStudentInformation();
            }
        });

        btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateStudentInformation();
            }
        });

        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteStudentInformation();
            }
        });

        // Closing the window
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    private void saveStudentInformation() {
        // Implement the logic for saving student information
        System.out.println("Save button clicked.");
    }

    private void updateStudentInformation() {
        // Implement the logic for updating student information
        System.out.println("Update button clicked.");
    }

    private void deleteStudentInformation() {
        // Implement the logic for deleting student information
        System.out.println("Delete button clicked.");
    }

    public static void main(String[] args) {
        new StudentInformationForm();
    }
}
