// File: src/gui/LoginFrame.java

package gui;

import javax.swing.*;
import java.awt.*;
import gui.Dashboardframe; // Make sure this is present

public class loginFrame extends JFrame {

    public loginFrame() {
        setTitle("Login - Coffee Shop");
        setSize(300, 180);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(3, 2, 5, 5));

        JLabel usernameLabel = new JLabel("Username:");
        JTextField usernameField = new JTextField();

        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField();

        JButton loginButton = new JButton("Login");

        loginButton.addActionListener(e -> {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            if ("zeenat".equals(username) && "khan123".equals(password)) {
                JOptionPane.showMessageDialog(this, "Login Successful!");
                dispose(); // Close login window
                new Dashboardframe(); // Correct class name
            } else {
                JOptionPane.showMessageDialog(this, "Invalid username or password.", "Login Failed", JOptionPane.ERROR_MESSAGE);
            }
        });

        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(new JLabel()); // for spacing
        panel.add(loginButton);

        add(panel);
        setVisible(true);
    }
}










