package gui;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MenuManagementFrame extends JFrame {

    private DefaultListModel<String> menuListModel;

    public MenuManagementFrame() {
        setTitle("Manage Menu - Coffee Shop");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        // Title
        JLabel titleLabel = new JLabel("Menu Management", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
        add(titleLabel, BorderLayout.NORTH);

        // List of items
        menuListModel = new DefaultListModel<>();
        JList<String> menuList = new JList<>(menuListModel);
        add(new JScrollPane(menuList), BorderLayout.CENTER);

        // Input + buttons
        JPanel bottomPanel = new JPanel(new FlowLayout());

        JTextField itemField = new JTextField(15);
        JButton addButton = new JButton("Add Item");
        JButton deleteButton = new JButton("Delete Selected");

        bottomPanel.add(itemField);
        bottomPanel.add(addButton);
        bottomPanel.add(deleteButton);

        add(bottomPanel, BorderLayout.SOUTH);

        // Action listeners
        addButton.addActionListener(e -> {
            String item = itemField.getText().trim();
            if (!item.isEmpty()) {
                menuListModel.addElement(item);
                itemField.setText("");
            }
        });

        deleteButton.addActionListener(e -> {
            int selectedIndex = menuList.getSelectedIndex();
            if (selectedIndex != -1) {
                menuListModel.remove(selectedIndex);
            }
        });

        setVisible(true);
    }
}

