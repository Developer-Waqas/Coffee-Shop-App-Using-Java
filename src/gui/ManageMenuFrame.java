package gui;

import javax.swing.*;

public class ManageMenuFrame extends JFrame {

    public ManageMenuFrame() {
        setTitle("Manage Menu - Coffee Shop");
        setSize(400, 300);
        setLocationRelativeTo(null); // Center the window
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Close only the Manage Menu screen, not the whole app

        // Panel for the Manage Menu screen
        JPanel panel = new JPanel();
        panel.add(new JLabel("This is the Manage Menu screen."));

        // Add more UI components like text fields, buttons for adding/editing/removing menu items
        JButton addItemButton = new JButton("Add Item");
        panel.add(addItemButton);

        JButton editItemButton = new JButton("Edit Item");
        panel.add(editItemButton);

        JButton removeItemButton = new JButton("Remove Item");
        panel.add(removeItemButton);

        add(panel); // Add the panel to the frame
        setVisible(true);
    }
}


