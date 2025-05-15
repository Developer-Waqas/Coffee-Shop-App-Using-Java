package gui;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class orderManagementFrame extends JFrame {

    private DefaultListModel<String> orderListModel;

    public orderManagementFrame() {
        setTitle("Manage Orders - Coffee Shop");
        setSize(450, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("Order Management", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
        add(titleLabel, BorderLayout.NORTH);

        // Order list
        orderListModel = new DefaultListModel<>();
        JList<String> orderList = new JList<>(orderListModel);
        add(new JScrollPane(orderList), BorderLayout.CENTER);

        // Input panel
        JPanel inputPanel = new JPanel(new FlowLayout());

        JTextField customerNameField = new JTextField(10);
        JTextField itemField = new JTextField(10);
        JButton addOrderButton = new JButton("Add Order");
        JButton deleteOrderButton = new JButton("Delete Selected");

        inputPanel.add(new JLabel("Customer:"));
        inputPanel.add(customerNameField);
        inputPanel.add(new JLabel("Item:"));
        inputPanel.add(itemField);
        inputPanel.add(addOrderButton);
        inputPanel.add(deleteOrderButton);

        add(inputPanel, BorderLayout.SOUTH);

        // Add order logic
        addOrderButton.addActionListener(e -> {
            String customer = customerNameField.getText().trim();
            String item = itemField.getText().trim();

            if (!customer.isEmpty() && !item.isEmpty()) {
                orderListModel.addElement("Customer: " + customer + " | Item: " + item);
                customerNameField.setText("");
                itemField.setText("");
            }
        });

        // Delete order
        deleteOrderButton.addActionListener(e -> {
            int index = orderList.getSelectedIndex();
            if (index != -1) {
                orderListModel.remove(index);
            }
        });

        setVisible(true);
    }
}

