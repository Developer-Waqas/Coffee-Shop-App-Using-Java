// File: src/gui/DashboardFrame.java
package gui;

import javax.swing.*;
import java.awt.*;

public class Dashboardframe extends JFrame {

    public Dashboardframe() {
        setTitle("Dashboard - Coffee Shop");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Welcome label
        JLabel welcomeLabel = new JLabel("Welcome to Coffee Shop Dashboard!", SwingConstants.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 16));
        add(welcomeLabel, BorderLayout.NORTH);

        // Buttons Panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(3, 1, 10, 10));

        JButton manageMenuBtn = new JButton("Manage Menu");
        JButton manageOrdersBtn = new JButton("Manage Orders");
        JButton logoutBtn = new JButton("Logout");

        // Add buttons
        buttonPanel.add(manageMenuBtn);
        buttonPanel.add(manageOrdersBtn);
        buttonPanel.add(logoutBtn);

        add(buttonPanel, BorderLayout.CENTER);

        // Actions
        logoutBtn.addActionListener(e -> {
            dispose();
            new loginFrame(); // Go back to login
        });

        // For now, just show a message
        manageMenuBtn.addActionListener(e -> new MenuManagementFrame());

        manageOrdersBtn.addActionListener(e -> new orderManagementFrame());


        setVisible(true);
    }
}





